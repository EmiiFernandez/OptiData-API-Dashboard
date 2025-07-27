package com.ef.optidata.service;


import com.ef.optidata.dto.RequestCreatePatient;
import com.ef.optidata.dto.ResponseCreatePatient;
import com.ef.optidata.dto.ResponsePatient;

import java.util.List;

public interface IPatientService {
    ResponseCreatePatient createPatient(RequestCreatePatient requestCreatePatient);
    ResponsePatient getPatientId(Long id);
    List<ResponsePatient> getAllPatient();
}
