package com.ef.optidata.controller;

import com.ef.optidata.dto.RequestCreatePatient;
import com.ef.optidata.dto.ResponseCreatePatient;
import com.ef.optidata.dto.ResponsePatient;
import com.ef.optidata.service.impl.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping()
    public ResponseEntity<ResponseCreatePatient> createPatient(@Valid @RequestBody RequestCreatePatient requestCreatePatient) {
        ResponseCreatePatient response = patientService.createPatient(requestCreatePatient);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponsePatient> getPatientId( @PathVariable Long id) {
        ResponsePatient response = patientService.getPatientId(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping()
    public ResponseEntity<List<ResponsePatient>> getAll() {
        List<ResponsePatient> response = patientService.getAllPatient();
        return ResponseEntity.ok(response);
    }
}
