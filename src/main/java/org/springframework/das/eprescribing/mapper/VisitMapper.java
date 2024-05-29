package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.das.eprescribing.rest.dto.VisitDto;
import org.springframework.das.eprescribing.model.Visit;
import org.springframework.das.eprescribing.rest.dto.VisitFieldsDto;

import java.util.Collection;

/**
 * Map Visit & VisitDto using mapstruct
 */
@Mapper(uses = PetMapper.class)
public interface VisitMapper {
    Visit toVisit(VisitDto visitDto);

    Visit toVisit(VisitFieldsDto visitFieldsDto);

    @Mapping(source = "pet.id", target = "petId")
    VisitDto toVisitDto(Visit visit);

    Collection<VisitDto> toVisitsDto(Collection<Visit> visits);

}
