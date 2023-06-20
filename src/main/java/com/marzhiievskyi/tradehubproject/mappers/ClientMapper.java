package com.marzhiievskyi.tradehubproject.mappers;

import com.marzhiievskyi.tradehubproject.domain.Client;
import com.marzhiievskyi.tradehubproject.dto.showClientInfoDTO;
import org.mapstruct.*;


@Mapper(componentModel = "spring")
public interface ClientMapper {


    Client toEntity(showClientInfoDTO showClientInfoDTO);

    showClientInfoDTO toDto(Client client);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Client partialUpdate(showClientInfoDTO showClientInfoDTO, @MappingTarget Client client);
}
