package org.team.data;

import java.util.HashMap;
import java.util.Map;

public class TeamPreferenceData {
	
	public static final String A_TEAM = "A-Team";
	public static final String X_MEN = "X-Men";
	public static final String SCRUM_LORDS = "Scrum Lords";
	public static final String PAIN_KILLERS = "Pain Killers";
	public static final String NEW_TEAM = "New Team";
	
	public static Map<String, String> CHOICE1 = new HashMap<String, String>(){{
		put(A_TEAM, "1,3,2,4,5");
		put(X_MEN, "2,3,4,1,5");
		put(SCRUM_LORDS, "1,2,3,4,5");
		put(PAIN_KILLERS, "3,2,1,4,5");
		put(NEW_TEAM, "1,2,3,4,5");
	}};
	
	public static Map<String, String> CHOICE2 = new HashMap<String, String>(){{
		put(A_TEAM, "1,3,2,4,5");
		put(X_MEN, "5,4,3,2,1");
		put(SCRUM_LORDS, "3,2,1,5,4");
		put(PAIN_KILLERS, "1,4,3,2,5");
		put(NEW_TEAM, "5,2,3,1,4");
	}};
	
	public static Map<String, String> CHOICE3 = new HashMap<String, String>(){{
		put(A_TEAM, "1,3,2,4,5");
		put(X_MEN, "5,4,3,2,5");
		put(SCRUM_LORDS, "7,2,1,5,4");
		put(PAIN_KILLERS, "1,4,3.2,2,5");
		put(NEW_TEAM, "5,2,3,-1,4");
	}};
}
