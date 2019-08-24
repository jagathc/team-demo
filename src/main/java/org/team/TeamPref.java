package org.team;

import java.util.List;
import java.util.Objects;

public class TeamPref {
	
	private final String teamName;
	private final List<String> preferences;
	private int allocatedNumber;
	
	public TeamPref(String teamName, List<String> preferences) {
		this.teamName = teamName;
		this.preferences = preferences;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public List<String> getPreferences() {
		return preferences;
	}

	public int getAllocatedNumber() {
		return allocatedNumber;
	}

	public void setAllocatedNumber(int allocatedNumber) {
		this.allocatedNumber = allocatedNumber;
	}

	@Override
	public String toString() {
		return teamName + ": " + (allocatedNumber == -1 ? "Input error. -1 is not a valid space ID. Available spaces are 1 - 5." : allocatedNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(teamName, preferences, allocatedNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamPref other = (TeamPref) obj;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}
}
