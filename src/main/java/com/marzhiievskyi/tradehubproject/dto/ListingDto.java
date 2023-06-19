package com.marzhiievskyi.tradehubproject.dto;

import com.marzhiievskyi.tradehubproject.domain.Currency;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.marzhiievskyi.tradehubproject.domain.Listing}
 */
public record ListingDto(String title, String description, Double price, Currency currency, ClientDto client,
                         LocalDateTime updated, LocalDateTime created) implements Serializable {
}