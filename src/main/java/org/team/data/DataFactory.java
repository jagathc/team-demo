package org.team.data;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataFactory {
	
	public static final String A_TEAM = "A-Team";
	public static final String X_MEN = "X-Men";
	public static final String SCRUM_LORDS = "Scrum Lords";
	public static final String PAIN_KILLERS = "Pain Killers";
	public static final String NEW_TEAM = "New Team";
	
	public static Set<Room> generateRooms() {
        return Stream.of(1,3,2,4,5).map(Object::toString).map(Room::new).collect(Collectors.toSet());
    }
	
	public static Set<Preference> generatePreferences(Map<String, String[]> input) {
		for (String[] prefs : input.values()) {
		    if (!isValid(prefs)) {
		    	return null;
		    }
		}	
		
        return Stream.of(
                new Preference(
                        new Team(A_TEAM),
                        Stream.of(input.get(A_TEAM)).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(X_MEN),
                        Stream.of(input.get(X_MEN)).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(SCRUM_LORDS),
                        Stream.of(input.get(SCRUM_LORDS)).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(PAIN_KILLERS),
                        Stream.of(input.get(PAIN_KILLERS)).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(NEW_TEAM),
                        Stream.of(input.get(NEW_TEAM)).map(Object::toString).map(Room::new).collect(Collectors.toList())
                )
        )
                .collect(Collectors.toSet());
    }	

	public static boolean isValid(String[] prefs) {
		for (String sVal : prefs) { 
			try {
				int iVal = Integer.valueOf(sVal);
				if (iVal < 0 || iVal > 5) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
	
	public static Set<Preference> generatePreferenceSet1() {
        return Stream.of(
                new Preference(
                        new Team(A_TEAM),
                        Stream.of(1,3,2,4,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(X_MEN),
                        Stream.of(2,3,4,1,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(SCRUM_LORDS),
                        Stream.of(1,2,3,4,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(PAIN_KILLERS),
                        Stream.of(3,2,1,4,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(NEW_TEAM),
                        Stream.of(1,2,3,4,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                )
        )
                .collect(Collectors.toSet());
    }

	public static Set<Preference> generatePreferenceSet2() {
        return Stream.of(
                new Preference(
                        new Team(A_TEAM),
                        Stream.of(1,3,2,4,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(X_MEN),
                        Stream.of(5,4,3,2,1).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(SCRUM_LORDS),
                        Stream.of(3,2,1,5,4).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(PAIN_KILLERS),
                        Stream.of(1,4,3,2,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(NEW_TEAM),
                        Stream.of(5,2,3,1,4).map(Object::toString).map(Room::new).collect(Collectors.toList())
                )
        )
                .collect(Collectors.toSet());
    }

	public static Set<Preference> generatePreferenceSet3() {
        return Stream.of(
                new Preference(
                        new Team(A_TEAM),
                        Stream.of(1,3,2,4,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(X_MEN),
                        Stream.of(5,4,3,2,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(SCRUM_LORDS),
                        Stream.of(7,2,1,5,4).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(PAIN_KILLERS),
                        Stream.of(1,4,3.2,2,5).map(Object::toString).map(Room::new).collect(Collectors.toList())
                ),
                new Preference(
                        new Team(NEW_TEAM),
                        Stream.of(5,2,3,-1,4).map(Object::toString).map(Room::new).collect(Collectors.toList())
                )
        )
                .collect(Collectors.toSet());
    }
}
