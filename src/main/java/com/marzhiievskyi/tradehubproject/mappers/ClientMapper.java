package com.marzhiievskyi.tradehubproject.mappers;

import com.marzhiievskyi.tradehubproject.domain.Client;
import com.marzhiievskyi.tradehubproject.dto.ClientDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client toEntity(ClientDto clientDto);

    ClientDto toDto(Client client);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Client partialUpdate(ClientDto clientDto, @MappingTarget Client client);
}
