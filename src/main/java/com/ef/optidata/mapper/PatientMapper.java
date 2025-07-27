package com.ef.optidata.mapper;

import com.ef.optidata.dto.RequestCreatePatient;
import com.ef.optidata.dto.ResponseCreatePatient;
import com.ef.optidata.dto.ResponsePatient;
import com.ef.optidata.entity.Patient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    Patient requestDtoToPatient(RequestCreatePatient requestCreatePatient);
    ResponseCreatePatient responseCreatePatient(Patient patient);
    ResponsePatient responsePatient(Patient patient);
    List<ResponsePatient> responseListAllPatients(List<Patient> patientList);
}
