package com.ef.optidata.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResourceAlreadyExistsException extends RuntimeException {
    private String message;
}
