package com.rocketseat.planner.trip;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public record TripResquestPayload(@NotBlank String destination, @NotBlank String starts_at, String ends_at,
                                  @NotNull @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}") List<String> emails_to_invite,
                                  @NotNull @Email String owner_email, @NotNull String owner_name) {
}
