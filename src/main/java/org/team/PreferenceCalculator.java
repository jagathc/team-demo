package org.team;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.team.data.Preference;
import org.team.data.Result;
import org.team.data.Room;

public class PreferenceCalculator {

    public Optional<Result> calculate(
            Set<Room> availableRooms,
			Set<Preference> preferences
    ) {
        return calculateIter(availableRooms, preferences, new Result())
//                .peek(a -> System.out.println(a.getScore() + " => " + a))
                .min(Comparator.comparingDouble(Result::getScore));
    }

    private Stream<Result> calculateIter(
            Set<Room> availableRooms,
            Set<Preference> preferences,
            Result currentResult
    ) {
        if (availableRooms.isEmpty() || preferences.isEmpty()) {
            return Stream.of(currentResult);
        }

        return preferences.stream()
                .flatMap(preference -> {
                    AbstractMap.SimpleEntry<Room, Integer> entry = selectRoom(preference, availableRooms);
                    final Room selectedRoom = entry.getKey();
                    Integer preferenceIndex = entry.getValue();

                    Result newResult = currentResult.getUpdated(preference.getTeam(), selectedRoom, preferenceIndex);
                    Set<Room> newAvailableRooms = availableRooms.stream()
                            .filter(room -> !selectedRoom.equals(room))
                            .collect(Collectors.toSet());

                    Set<Preference> newPreferences = preferences.stream()
                            .filter(p -> !p.equals(preference))
                            .collect(Collectors.toSet());

                    return calculateIter(
                            newAvailableRooms,
                            newPreferences,
                            newResult
                    );
                });
    }

    private AbstractMap.SimpleEntry<Room, Integer> selectRoom(Preference preference, Set<Room> availableRooms) {
        List<Room> preferenceOrder = preference.getPreferenceOrder();

        Room selectedRoom = null;
        int selectedPreferenceIndex = -1;

        for (int i = 0; i < preferenceOrder.size(); i++) {
            Room preferredRoom = preferenceOrder.get(i);
            if (availableRooms.contains(preferredRoom)) {
                selectedRoom = preferredRoom;
                selectedPreferenceIndex = i;
                break;
            }
        }

        return new AbstractMap.SimpleEntry<>(selectedRoom, selectedPreferenceIndex);
    }
}
