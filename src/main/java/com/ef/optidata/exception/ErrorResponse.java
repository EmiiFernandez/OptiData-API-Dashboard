package com.ef.optidata.exception;

public record ErrorResponse(
        int statusCode,
        String message
) {

}
