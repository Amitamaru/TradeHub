package com.marzhiievskyi.tradehubproject.mappers;

import com.marzhiievskyi.tradehubproject.domain.Listing;
import com.marzhiievskyi.tradehubproject.dto.ListingDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ListingMapper {

    Listing toEntity(ListingDto listingDto);

    ListingDto toDto(Listing listing);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Listing partialUpdate(ListingDto listingDto, @MappingTarget Listing listing);
}
