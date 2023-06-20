package com.marzhiievskyi.tradehubproject.domain.dto;

import com.marzhiievskyi.tradehubproject.domain.constants.Permission;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.marzhiievskyi.tradehubproject.domain.Client}
 */
public record ShowInfoClientDTO(String login, String name, String surname, String email,
                                Permission permission, LocalDateTime clientRegistered,
                                LocalDateTime clientUpdated) implements Serializable {
}