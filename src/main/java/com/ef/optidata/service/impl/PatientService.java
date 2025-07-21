package com.ef.optidata.service.impl;

import com.ef.optidata.dto.RequestCreatePatientDTO;
import com.ef.optidata.dto.ResponseCreatePatientDTO;
import com.ef.optidata.dto.ResponsePatientDTO;
import com.ef.optidata.entity.Patient;
import com.ef.optidata.exception.ResourceNotFoundException;
import com.ef.optidata.repository.IPatientRepository;
import com.ef.optidata.mapper.PatientMapper;
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
    public ResponseCreatePatientDTO createPatient(RequestCreatePatientDTO requestCreatePatientDTO) {
        Patient patient = patientMapper.requestDtoToPatient(requestCreatePatientDTO);
        iPatientRepository.save(patient);
        return patientMapper.responseCreatePatient(patient);
    }

    @Override
    public ResponsePatientDTO getPatientId(Long id) {
        Patient patient = iPatientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found patient by id: " + id));
        return patientMapper.responsePatient(patient);
    }

    @Override
    public List<ResponsePatientDTO> getAllPatient() {
        List<Patient> patients = iPatientRepository.findAll();
        if (patients.isEmpty()) {
            throw new ResourceNotFoundException("No se encontraron pacientes.");
        }
        return patientMapper.responseListAllPatients(patients);
    }
}
