package org.team;

import java.util.HashMap;
import java.util.Set;

import org.team.data.Preference;
import org.team.data.Result;
import org.team.data.Room;
import org.team.data.DataFactory;

public class Application {

	public void run(Set<Room> rooms, Set<Preference> preferences) {
		PreferenceCalculator preferenceCalculator = new PreferenceCalculator();

		Result result = preferenceCalculator.calculate(rooms, preferences)
				.orElseThrow(() -> new RuntimeException("Calculation failed"));

//        System.out.println("Score => " + result.getScore());
		System.out.println(result);
	}

	public static void main(String[] args) {
		Application app = new Application();
		Set<Room> rooms = DataFactory.generateRooms();
		Set<Preference> preferences1 = DataFactory.generatePreferences(new HashMap<String, String[]>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(DataFactory.A_TEAM, new String[] { "1", "3", "2", "4", "5" });
				put(DataFactory.X_MEN, new String[] { "2", "3", "4", "1", "5" });
				put(DataFactory.SCRUM_LORDS, new String[] { "1", "2", "3", "4", "5" });
				put(DataFactory.PAIN_KILLERS, new String[] { "3", "2", "1", "4", "5" });
				put(DataFactory.NEW_TEAM, new String[] { "1", "2", "3", "4", "5" });
			}
		});

		Set<Preference> preferences2 = DataFactory.generatePreferences(new HashMap<String, String[]>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(DataFactory.A_TEAM, new String[] { "1", "3", "2", "4", "5" });
				put(DataFactory.X_MEN, new String[] { "5", "4", "3", "2", "1" });
				put(DataFactory.SCRUM_LORDS, new String[] { "3", "2", "1", "5", "4" });
				put(DataFactory.PAIN_KILLERS, new String[] { "1", "4", "3", "2", "5" });
				put(DataFactory.NEW_TEAM, new String[] { "5", "2", "3", "1", "4" });
			}
		});

		Set<Preference> preferences3 = DataFactory.generatePreferences(new HashMap<String, String[]>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(DataFactory.A_TEAM, new String[] { "1", "3", "2", "4", "5" });
				put(DataFactory.X_MEN, new String[] { "5", "4", "3", "2", "5" });
				put(DataFactory.SCRUM_LORDS, new String[] { "7", "2", "1", "5", "4" });
				put(DataFactory.PAIN_KILLERS, new String[] { "1", "4", "3.2", "2", "5" });
				put(DataFactory.NEW_TEAM, new String[] { "5", "2", "3", "-1", "4" });
			}
		});

		if (preferences1 != null) {
			app.run(rooms, DataFactory.generatePreferenceSet1());
		} else {
			System.out.println("Input error. -1 is not a valid space ID. Available spaces are 1 - 5");
		}

		if (preferences2 != null) {
			app.run(rooms, DataFactory.generatePreferenceSet2());
		} else {
			System.out.println("Input error. -1 is not a valid space ID. Available spaces are 1 - 5");
		}

		if (preferences3 != null) {
			app.run(rooms, DataFactory.generatePreferenceSet3());
		} else {
			System.out.println("Input error. -1 is not a valid space ID. Available spaces are 1 - 5");
		}
	}

}
