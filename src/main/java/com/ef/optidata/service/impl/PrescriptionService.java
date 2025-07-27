package com.ef.optidata.service.impl;

import com.ef.optidata.dto.RequestCreatePrescription;
import com.ef.optidata.dto.ResponseCreatePrescription;
import com.ef.optidata.dto.ResponsePatientPrescription;
import com.ef.optidata.entity.Patient;
import com.ef.optidata.entity.Prescription;
import com.ef.optidata.exception.ResourceNotFoundException;
import com.ef.optidata.mapper.PrescriptionMapper;
import com.ef.optidata.repository.IPatientRepository;
import com.ef.optidata.repository.IPrescriptionRepository;
import com.ef.optidata.service.IPrescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PrescriptionService implements IPrescriptionService {

    private final IPrescriptionRepository iPrescriptionRepository;
    private final IPatientRepository iPatientRepository;
    private final PrescriptionMapper prescriptionMapper;

    @Override
    public ResponseCreatePrescription createPrescription(RequestCreatePrescription requestCreatePrescription) {
        Optional<Patient> patientOpt = iPatientRepository.findByDocumentNumber(requestCreatePrescription.getDocumentNumber());
        if(patientOpt.isPresent()) {
            Patient patient = patientOpt.get();

            Prescription prescription = prescriptionMapper.requestDtoPrescription(requestCreatePrescription);
            prescription.setPatient(patient);

            Prescription prescriptionSaved = iPrescriptionRepository.save(prescription);

            return prescriptionMapper.responseCreatePrescription(prescriptionSaved, patient);
        } else {
            throw  new ResourceNotFoundException("Paciente no encontrado");
        }
    }

    @Override
    public ResponsePatientPrescription getAllPrescriptionsByDocumentNumber(String documentNumber) {
        Optional<Patient> patientOpt = iPatientRepository.findByDocumentNumber(documentNumber);

        if (patientOpt.isEmpty()) {
            throw new ResourceNotFoundException("Paciente no encontrado");
        }

        Patient patient = patientOpt.get();
        List<Prescription> prescriptions = iPrescriptionRepository.findAllPrescriptionByPatient_IdPatient(patient.getIdPatient());

        if (prescriptions == null || prescriptions.isEmpty()) {
            throw new ResourceNotFoundException("El paciente no tiene prescripciones");
        }

        return prescriptionMapper.ResponsePatientPrescription(patient, prescriptions);
    }
}
