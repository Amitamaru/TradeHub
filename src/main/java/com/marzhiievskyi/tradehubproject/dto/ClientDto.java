package com.marzhiievskyi.tradehubproject.dto;

import com.marzhiievskyi.tradehubproject.domain.Permission;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.marzhiievskyi.tradehubproject.domain.Client}
 */
public record ClientDto(String login, String name, String surname, String email,
                        Permission permission, LocalDateTime clientRegistered,
                        LocalDateTime clientUpdated) implements Serializable {
}