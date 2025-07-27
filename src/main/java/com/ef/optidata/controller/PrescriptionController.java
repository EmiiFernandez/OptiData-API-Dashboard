package com.ef.optidata.controller;

import com.ef.optidata.dto.*;
import com.ef.optidata.service.impl.PrescriptionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescripciones")
@RequiredArgsConstructor
public class PrescriptionController {
    private final PrescriptionService prescriptionService;

    @PostMapping()
    public ResponseEntity<ResponsePrescription> createPrescription(@Valid @RequestBody RequestCreatePrescription requestCreatePrescription) {
        ResponsePrescription response = prescriptionService.createPrescription(requestCreatePrescription);
        return ResponseEntity.ok(response);
    }

    @GetMapping()
    public ResponseEntity<List<ResponsePrescription>> getAllPrescriptions() {
        List<ResponsePrescription> response = prescriptionService.getAllPrescriptions();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/with-patient")
    public ResponseEntity<List<ResponsePrescriptionWithDataPatient>> getAllPrescriptionsWithPatient() {
        List<ResponsePrescriptionWithDataPatient> response = prescriptionService.getAllPrescriptionsWithPatient();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{documentNumber}")
    public ResponseEntity<ResponsePatientPrescription> getAllPrescriptionByDocumentNumber(@PathVariable String documentNumber) {
        ResponsePatientPrescription response = prescriptionService.getAllPrescriptionsByDocumentNumber(documentNumber);
        return ResponseEntity.ok(response);
    }
}
