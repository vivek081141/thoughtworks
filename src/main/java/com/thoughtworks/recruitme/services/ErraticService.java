package com.thoughtworks.recruitme.services;

public interface ErraticService {
    RandomError execute(ExceptionService stubService) throws Exception;
}
