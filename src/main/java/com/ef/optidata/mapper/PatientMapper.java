package com.ef.optidata.mapper;

import com.ef.optidata.dto.RequestCreatePatientDTO;
import com.ef.optidata.dto.ResponseCreatePatientDTO;
import com.ef.optidata.dto.ResponsePatientDTO;
import com.ef.optidata.entity.Patient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    Patient requestDtoToPatient(RequestCreatePatientDTO requestCreatePatientDTO);
    ResponseCreatePatientDTO responseCreatePatient(Patient patient);
    ResponsePatientDTO responsePatient(Patient patient);
    List<ResponsePatientDTO> responseListAllPatients(List<Patient> patientList);
}
