package com.ef.optidata.service.impl;

import com.ef.optidata.dto.RequestCreatePatient;
import com.ef.optidata.dto.ResponsePatient;
import com.ef.optidata.dto. ResponseCreatePatient;
import com.ef.optidata.entity.Patient;
import com.ef.optidata.exception.ResourceAlreadyExistsException;
import com.ef.optidata.exception.ResourceNotFoundException;
import com.ef.optidata.mapper.PatientMapper;
import com.ef.optidata.repository.IPatientRepository;
import com.ef.optidata.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService {

    private final IPatientRepository iPatientRepository;
    private final PatientMapper patientMapper;

    @Override
    public  ResponseCreatePatient createPatient(RequestCreatePatient requestCreatePatient) {
        boolean patientExists = iPatientRepository.existsByDocumentNumberAndBirthDate(
                requestCreatePatient.getDocumentNumber(),
                requestCreatePatient.getBirthDate()
        );

        if (patientExists) {
            throw new ResourceAlreadyExistsException(
                    String.format("El paciente ya existe. Documento: %s, Fecha de nacimiento: %s",
                            requestCreatePatient.getDocumentNumber(),
                            requestCreatePatient.getBirthDate())
            );
        }
        Patient patient = patientMapper.requestDtoToPatient(requestCreatePatient);
        iPatientRepository.save(patient);
        return patientMapper.responseCreatePatient(patient);
    }

    @Override
    public ResponsePatient getPatientId(Long id) {
        Patient patient = iPatientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found patient by id: " + id));
        return patientMapper.responsePatient(patient);
    }

    @Override
    public List<ResponsePatient> getAllPatient() {
        List<Patient> patients = iPatientRepository.findAll();
        if (patients.isEmpty()) {
            throw new ResourceNotFoundException("No se encontraron pacientes.");
        }
        return patientMapper.responseListAllPatients(patients);
    }
}
