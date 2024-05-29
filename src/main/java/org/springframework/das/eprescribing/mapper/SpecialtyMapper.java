package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.springframework.das.eprescribing.rest.dto.SpecialtyDto;
import org.springframework.das.eprescribing.model.Specialty;

import java.util.Collection;

/**
 * Map Specialty & SpecialtyDto using mapstruct
 */
@Mapper
public interface SpecialtyMapper {
    Specialty toSpecialty(SpecialtyDto specialtyDto);

    SpecialtyDto toSpecialtyDto(Specialty specialty);

    Collection<SpecialtyDto> toSpecialtyDtos(Collection<Specialty> specialties);

    Collection<Specialty> toSpecialtys(Collection<SpecialtyDto> specialties);

}
