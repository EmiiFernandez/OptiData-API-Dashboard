package com.ef.optidata.controller;

import com.ef.optidata.dto.RequestCreatePrescription;
import com.ef.optidata.dto.ResponseCreatePrescription;
import com.ef.optidata.dto.ResponsePatientPrescription;
import com.ef.optidata.dto.ResponsePrescription;
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
    public ResponseEntity<ResponseCreatePrescription> createPrescription(@Valid @RequestBody RequestCreatePrescription requestCreatePrescription) {
        ResponseCreatePrescription response = prescriptionService.createPrescription(requestCreatePrescription);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{documentNumber}")
    public ResponseEntity<ResponsePatientPrescription> getAllPrescriptionByDocumentNumber(@PathVariable String documentNumber) {
        ResponsePatientPrescription response = prescriptionService.getAllPrescriptionsByDocumentNumber(documentNumber);
        return ResponseEntity.ok(response);
    }
}
