package com.stelconsultancy.course.services.exceptions;

public class ResourceNotFoundException  extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found: " + id);
    }
}
