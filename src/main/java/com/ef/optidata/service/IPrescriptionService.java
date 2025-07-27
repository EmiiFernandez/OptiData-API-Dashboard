package com.ef.optidata.service;

import com.ef.optidata.dto.*;

import java.util.List;

public interface IPrescriptionService {
    ResponsePrescription createPrescription(RequestCreatePrescription requestCreatePrescription);
    ResponsePatientPrescription getAllPrescriptionsByDocumentNumber(String documentNumber);
    List<ResponsePrescription> getAllPrescriptions();
    List<ResponsePrescriptionWithDataPatient> getAllPrescriptionsWithPatient();
}
