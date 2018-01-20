package com.thoughtworks.recruitme.services;

public class MethodNotImplementedException extends RuntimeException {

    public MethodNotImplementedException(String methodName) {
        super("Method: " + methodName + " is not implemented");
    }
}
