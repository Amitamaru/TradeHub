package com.marzhiievskyi.tradehubproject.mappers;

import com.marzhiievskyi.tradehubproject.domain.Listing;
import com.marzhiievskyi.tradehubproject.dto.showInfoListingDTO;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ListingMapper {

    Listing toEntity(showInfoListingDTO showInfoListingDTO);

    showInfoListingDTO toDto(Listing listing);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Listing partialUpdate(showInfoListingDTO showInfoListingDTO, @MappingTarget Listing listing);
}
