package com.rocketseat.planner.participant;

import java.util.List;
import java.util.UUID;

public record ParticipantCreateResponse(UUID id) {
    List<Participant> findByTripId(UUID tripId) {
        return null;
    }
}
