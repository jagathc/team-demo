package org.team;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.team.data.TeamPreferenceData;

public class TeamPrefTest {

	@Test
	public void testAllocateTeamsOnFirstPreference() {
		
		List<TeamPref> prefs = new ArrayList<TeamPref>();
		prefs.add(new TeamPref(TeamPreferenceData.A_TEAM, Arrays.asList("1","2","3","4","5")));
		prefs.add(new TeamPref(TeamPreferenceData.X_MEN, Arrays.asList("2","4","3","5","1")));
		prefs.add(new TeamPref(TeamPreferenceData.SCRUM_LORDS, Arrays.asList("3","2","1","5","4")));
		prefs.add(new TeamPref(TeamPreferenceData.PAIN_KILLERS, Arrays.asList("4","1","3","2","5")));
		prefs.add(new TeamPref(TeamPreferenceData.NEW_TEAM, Arrays.asList("5","2","3","1","4")));
		
		Application app = new Application();
		prefs = app.processData(prefs);

		assertEquals(1, prefs.get(0).getAllocatedNumber());
		assertEquals(2, prefs.get(1).getAllocatedNumber());
		assertEquals(3, prefs.get(2).getAllocatedNumber());
		assertEquals(4, prefs.get(3).getAllocatedNumber());
		assertEquals(5, prefs.get(4).getAllocatedNumber());
	}

}
