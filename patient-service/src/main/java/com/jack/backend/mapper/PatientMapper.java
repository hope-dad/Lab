package com.jack.backend.mapper;

import com.jack.backend.dto.PatientResponseDTO;
import com.jack.backend.model.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {


  PatientResponseDTO toDTO(Patient patient);
}
