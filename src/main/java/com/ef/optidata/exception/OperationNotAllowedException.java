package com.ef.optidata.exception;

// Operación no permitida
public class OperationNotAllowedException extends BaseException {
    public OperationNotAllowedException(String message) {
        super(message);
    }
}
