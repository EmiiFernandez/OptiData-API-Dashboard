package com.ef.optidata.service;

import com.ef.optidata.dto.*;

public interface IPrescriptionService {
    ResponseCreatePrescription createPrescription(RequestCreatePrescription requestCreatePrescription);
    ResponsePatientPrescription getAllPrescriptionsByDocumentNumber(String documentNumber);
}
