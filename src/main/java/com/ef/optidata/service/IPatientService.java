package com.ef.optidata.service;

import com.ef.optidata.dto.RequestCreatePatientDTO;
import com.ef.optidata.dto.ResponseCreatePatientDTO;
import com.ef.optidata.dto.ResponsePatientDTO;

import java.util.List;

public interface IPatientService {
    ResponseCreatePatientDTO createPatient(RequestCreatePatientDTO requestCreatePatientDTO);
    ResponsePatientDTO getPatientId(Long id);
    List<ResponsePatientDTO> getAllPatient();
}
