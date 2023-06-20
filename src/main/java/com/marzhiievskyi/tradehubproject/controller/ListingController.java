package com.marzhiievskyi.tradehubproject.controller;

import com.marzhiievskyi.tradehubproject.domain.dto.ShowInfoListingDTO;
import com.marzhiievskyi.tradehubproject.service.ListingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trade-hub")
@RequiredArgsConstructor
public class ListingController {

    private final ListingService listingService;

    @GetMapping("/listings")
    public List<ShowInfoListingDTO> findAllListings() {
        return listingService.getAllListings();
    }

    @GetMapping("/listings/client{id}")
    public List<ShowInfoListingDTO> findListingByClientId(@PathVariable Long id) {
        return listingService.getListingsByClientId(id);
    }

    @GetMapping("/listings/{id}")
    public ShowInfoListingDTO findListingById(@PathVariable Long id) {
        return listingService.findListingById(id);
    }
}
