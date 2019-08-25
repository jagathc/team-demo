package org.team;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.team.data.DataFactory;
import org.team.data.Mapping;
import org.team.data.Preference;
import org.team.data.Result;
import org.team.data.Room;

public class PreferenceCalculatorTest {

	@Test
	public void testAllocateTeamsOnFirstPreference() {
		Set<Room> rooms = DataFactory.generateRooms();
		Set<Preference> preferences = DataFactory.generatePreferences(new HashMap<String, String[]>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(DataFactory.A_TEAM, new String[] { "1", "3", "2", "4", "5" });
				put(DataFactory.X_MEN, new String[] { "2", "3", "4", "1", "5" });
				put(DataFactory.SCRUM_LORDS, new String[] { "3", "2", "1", "4", "5" });
				put(DataFactory.PAIN_KILLERS, new String[] { "4", "2", "1", "3", "5" });
				put(DataFactory.NEW_TEAM, new String[] { "5", "2", "3", "4", "1" });
			}
		});

		PreferenceCalculator preferenceCalculator = new PreferenceCalculator();

		Result result = preferenceCalculator.calculate(rooms, preferences)
				.orElseThrow(() -> new RuntimeException("Calculation failed"));

		Set<Mapping> mappings = result.getMapping();
		
		for (Iterator<Mapping> it = mappings.iterator(); it.hasNext(); ) {
			Mapping f = it.next();
	        if (f.getTeam().getName().equals(DataFactory.A_TEAM)) {
	        	assertEquals("1", f.getRoom().getName());
	        } else if (f.getTeam().getName().equals(DataFactory.X_MEN)) {
	        	assertEquals("2", f.getRoom().getName());
	        } else if (f.getTeam().getName().equals(DataFactory.SCRUM_LORDS)) {
	        	assertEquals("3", f.getRoom().getName());
	        } else if (f.getTeam().getName().equals(DataFactory.PAIN_KILLERS)) {
	        	assertEquals("4", f.getRoom().getName());
	        } else if (f.getTeam().getName().equals(DataFactory.NEW_TEAM)) {
	        	assertEquals("5", f.getRoom().getName());
	        }
	    }
	}

}
