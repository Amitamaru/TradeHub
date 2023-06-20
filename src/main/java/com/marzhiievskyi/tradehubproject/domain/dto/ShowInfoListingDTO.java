package com.marzhiievskyi.tradehubproject.domain.dto;

import com.marzhiievskyi.tradehubproject.domain.constants.Currency;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.marzhiievskyi.tradehubproject.domain.Listing}
 */
public record ShowInfoListingDTO(String title, String description, Double price, Currency currency, ShowInfoClientDTO client,
                                 LocalDateTime updated, LocalDateTime created) implements Serializable {
}