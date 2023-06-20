package com.marzhiievskyi.tradehubproject.controller;

import com.marzhiievskyi.tradehubproject.dto.showInfoListingDTO;
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
    public List<showInfoListingDTO> findAllListings() {
        return listingService.getAllListings();
    }

    @GetMapping("/listings/{id}")
    public List<showInfoListingDTO> findListingByClientId(@PathVariable Long id) {
        return listingService.getListingsByClientId(id);
    }
}
