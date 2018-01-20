package com.thoughtworks.recruitme.findClassName;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

import java.util.ArrayList;

public class ClassIdentifierImpl<T, E> implements ClassIdentifier<T, E> {
  public String[] identifyClasses(T parameterOne, E parameterTwo) throws Exception {
    String[] list = new String[2];
    String[] one= parameterOne.getClass().getName().split("\\.");
    String[] two= parameterTwo.getClass().getName().split("\\.");

    list[0]=(one[one.length-1]);
    list[1]=(two[two.length-1]);
    return list;
  }
}
