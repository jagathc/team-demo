package org.team.data;

import java.util.List;
import java.util.Objects;

public class Preference {
	private final Team team;
	private final List<Room> preferenceOrder;

	public Preference(Team team, List<Room> preferenceOrder) {
		this.team = team;
		this.preferenceOrder = preferenceOrder;
	}

	public Team getTeam() {
		return team;
	}

	public List<Room> getPreferenceOrder() {
		return preferenceOrder;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Preference that = (Preference) o;
		return team.equals(that.team);
	}

	@Override
	public int hashCode() {
		return Objects.hash(team);
	}
}
