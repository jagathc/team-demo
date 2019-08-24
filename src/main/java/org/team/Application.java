package org.team;

import java.util.List;

import org.team.data.TeamPreferenceData;

public class Application {

	public List<TeamPref> processData(List<TeamPref> teamPrefs) {
		return teamPrefs;
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		app.processData(TeamPreferenceData.getPREF1());
		app.processData(TeamPreferenceData.getPREF2());
		app.processData(TeamPreferenceData.getPREF3());
	}

}
