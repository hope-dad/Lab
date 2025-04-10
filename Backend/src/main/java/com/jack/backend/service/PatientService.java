package com.jack.backend.service;

import com.jack.backend.dto.PatientResponseDTO;
import com.jack.backend.mapper.PatientMapper;
import com.jack.backend.model.Patient;
import com.jack.backend.repository.PatientRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

  private final PatientRepository patientRepository;
  private final PatientMapper patientMapper;

  public List<PatientResponseDTO> getAllPatients() {
    List<Patient> patientList = patientRepository.findAll();
    return patientList.stream()
        .map(patientMapper::toDTO)
        .toList();
  }


}
