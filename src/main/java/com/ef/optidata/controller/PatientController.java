package com.ef.optidata.controller;

import com.ef.optidata.dto.RequestCreatePatientDTO;
import com.ef.optidata.dto.ResponseCreatePatientDTO;
import com.ef.optidata.dto.ResponsePatientDTO;
import com.ef.optidata.service.impl.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping()
    public ResponseEntity<ResponseCreatePatientDTO> createPatient(@Valid @RequestBody RequestCreatePatientDTO requestCreatePatientDTO) {

    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePatientDTO> getPatientId( @PathVariable Long id) {
        ResponsePatientDTO response = patientService.getPatientId(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping()
    public ResponseEntity<List<ResponsePatientDTO>> getAll() {
        List<ResponsePatientDTO> response = patientService.getAllPatient();
        return ResponseEntity.ok(response);
    }
}
