package org.team.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.team.TeamPref;

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
	
	public static List<TeamPref> getPREF1 () {
		List<TeamPref> prefs = new ArrayList<TeamPref>();
		prefs.add(new TeamPref(A_TEAM, Arrays.asList("1","3","2","4","5")));
		prefs.add(new TeamPref(X_MEN, Arrays.asList("2","3","4","1","5")));
		prefs.add(new TeamPref(SCRUM_LORDS, Arrays.asList("1","2","3","4","5")));
		prefs.add(new TeamPref(PAIN_KILLERS, Arrays.asList("3","2","1","4","5")));
		prefs.add(new TeamPref(NEW_TEAM, Arrays.asList("1","2","3","4","5")));
		return prefs;
	}
	
	public static List<TeamPref> getPREF2 () {
		List<TeamPref> prefs = new ArrayList<TeamPref>();
		prefs.add(new TeamPref(A_TEAM, Arrays.asList("1","3","2","4","5")));
		prefs.add(new TeamPref(X_MEN, Arrays.asList("5","4","3","2","1")));
		prefs.add(new TeamPref(SCRUM_LORDS, Arrays.asList("3","2","1","5","4")));
		prefs.add(new TeamPref(PAIN_KILLERS, Arrays.asList("1","4","3","2","5")));
		prefs.add(new TeamPref(NEW_TEAM, Arrays.asList("5","2","3","1","4")));
		return prefs;
	}

	public static List<TeamPref> getPREF3 () {
		List<TeamPref> prefs = new ArrayList<TeamPref>();
		prefs.add(new TeamPref(A_TEAM, Arrays.asList("1","3","2","4","5")));
		prefs.add(new TeamPref(X_MEN, Arrays.asList("5","4","3","2","5")));
		prefs.add(new TeamPref(SCRUM_LORDS, Arrays.asList("7","2","1","5","4")));
		prefs.add(new TeamPref(PAIN_KILLERS, Arrays.asList("1","4","3.2","2","5")));
		prefs.add(new TeamPref(NEW_TEAM, Arrays.asList("5","2","3","-1","4")));
		return prefs;
	}
}
