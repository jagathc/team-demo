package org.team;

import java.util.Map;

import org.team.data.TeamPreferenceData;

public class Application {

	public void processData(Map<String, String> choice) {
		
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		app.processData(TeamPreferenceData.CHOICE1);
		app.processData(TeamPreferenceData.CHOICE2);
		app.processData(TeamPreferenceData.CHOICE3);
	}

}
