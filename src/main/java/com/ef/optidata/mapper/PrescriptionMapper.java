package com.ef.optidata.mapper;

import com.ef.optidata.dto.RequestCreatePrescription;
import com.ef.optidata.dto.ResponseCreatePrescription;
import com.ef.optidata.dto.ResponsePatientPrescription;
import com.ef.optidata.dto.ResponsePrescription;
import com.ef.optidata.entity.Patient;
import com.ef.optidata.entity.Prescription;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrescriptionMapper {
    Prescription requestDtoPrescription(RequestCreatePrescription requestCreatePrescription);
    @Mapping(source = "prescription.createdAt", target = "createdAt")
    ResponseCreatePrescription responseCreatePrescription(Prescription prescription, Patient patient);
    ResponsePrescription responsePrescription(Prescription prescription);
    List<ResponsePrescription> ResponseListPrescription(List<Prescription> prescriptions);
    ResponsePatientPrescription ResponsePatientPrescription(Patient patient, List<Prescription> prescriptions);

}
