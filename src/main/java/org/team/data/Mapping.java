package org.team.data;

public class Mapping {
	
	private Team team;
	private Room room;

	public Mapping(Team team, Room room) {
		this.team = team;
		this.room = room;
	}

	public Team getTeam() {
		return team;
	}

	public Room getRoom() {
		return room;
	}
	
	
}