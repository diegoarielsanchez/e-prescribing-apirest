package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.springframework.das.eprescribing.rest.dto.VetDto;
import org.springframework.das.eprescribing.rest.dto.VetFieldsDto;
import org.springframework.das.eprescribing.model.Vet;

import java.util.Collection;

/**
 * Map Vet & VetoDto using mapstruct
 */
@Mapper(uses = SpecialtyMapper.class)
public interface VetMapper {
    Vet toVet(VetDto vetDto);

    Vet toVet(VetFieldsDto vetFieldsDto);

    VetDto toVetDto(Vet vet);

    Collection<VetDto> toVetDtos(Collection<Vet> vets);
}
