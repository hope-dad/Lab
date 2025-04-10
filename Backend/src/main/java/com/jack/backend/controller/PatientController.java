package com.jack.backend.controller;

import com.jack.backend.dto.PatientResponseDTO;
import com.jack.backend.service.PatientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("${api.version.prefix}/patients")
public class PatientController {

  private final PatientService patientService;

  @GetMapping
  public ResponseEntity<List<PatientResponseDTO>> getPatients() {
    List<PatientResponseDTO> patients = patientService.getAllPatients();
    return ResponseEntity.ok().body(patients);
  }

}
