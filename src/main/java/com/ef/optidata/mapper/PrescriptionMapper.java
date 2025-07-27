package com.ef.optidata.mapper;

import com.ef.optidata.dto.*;
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
    ResponsePrescription responseCreatePrescription(Prescription prescription, Patient patient);
    @Mapping(source = "patient.idPatient", target = "idPatient")
    ResponsePrescription responsePrescription(Prescription prescription);
    default List<ResponsePrescription> ResponseListPrescription(List<Prescription> prescriptions) {
        return prescriptions.stream()
                .map(this::responsePrescription)
                .toList();
    }
    @Mapping(source = "patient.idPatient", target = "idPatient")
    @Mapping(source = "patient.firstName", target = "firstName")
    @Mapping(source = "patient.lastName", target = "lastName")
    ResponsePrescriptionWithDataPatient responsePrescriptionWithDataPatient(Prescription prescription);
    default List<ResponsePrescriptionWithDataPatient> ResponsePrescriptionWithDataPatient(List<Prescription> prescriptions) {
        return prescriptions.stream()
                .map(this::responsePrescriptionWithDataPatient)
                .toList();
    }
    ResponsePatientPrescription ResponsePatientPrescription(Patient patient, List<Prescription> prescriptions);
}
