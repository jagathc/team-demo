package org.team.data;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Result {
	private final Set<Mapping> mapping;
	private final double score;

	private Result(Set<Mapping> mapping, double score) {
		this.mapping = mapping;
		this.score = score;
	}

	public Result() {
		this(new HashSet<>(), 0.0);
	}

	public double getScore() {
		return score;
	}

	public Set<Mapping> getMapping() {
		return mapping;
	}

	public Result getUpdated(Team team, Room room, int preferenceIndex) {
		double newScore = calculateAverage(this.score, this.mapping.size(), preferenceIndex);

		Set<Mapping> newMappings = Stream.concat(mapping.stream(), Stream.of(new Mapping(team, room)))
				.collect(Collectors.toSet());

		return new Result(newMappings, newScore);
	}

	private double calculateAverage(double currentAverage, int currentSampleSize, int newData) {
		return ((currentAverage * currentSampleSize) + newData) / (mapping.size() + 1);
	}

	@Override
	public String toString() {
		return this.mapping.stream().sorted(Comparator.comparing(a -> a.getTeam().getName()))
				.map(e -> e.getTeam() + " Assigned to Room: " + e.getRoom()).collect(Collectors.joining(", "));

	}
}
