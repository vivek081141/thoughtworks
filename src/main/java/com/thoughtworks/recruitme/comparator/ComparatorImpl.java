package com.thoughtworks.recruitme.comparator;

import com.thoughtworks.recruitme.characterCount.CharacterCount;
import com.thoughtworks.recruitme.services.MethodNotImplementedException;

public class ComparatorImpl<T> implements Comparator<T> {

  public T findGreater(T parameterOne, T parameterTwo) throws Exception {

    Object o1=parameterOne;
    Object o2=parameterTwo;



    if(o1 instanceof  String && o2 instanceof  String){
      if(o1.toString().compareTo(o2.toString()) > 0){
        return parameterOne;
      }else{
        return parameterTwo;
      }
    }

    if(o1 instanceof  Integer && o2 instanceof  Integer){
      if(((Integer)o1).compareTo(((Integer) o2)) > 0){
        return parameterOne;
      }else{
        return parameterTwo;
      }
    }

    if(o1 instanceof Character && o2 instanceof  Character){
      if(((Character)o1).compareTo(((Character)o2)) > 0){
        return parameterOne;
      }else{
        return parameterTwo;
      }
    }

    if(o1 instanceof  Double && o2 instanceof  Double){
      if(((Double)o1).compareTo(((Double) o2)) > 0){
        return parameterOne;
      }else{
        return parameterTwo;
      }
    }

    //if(o1 instanceof String && !(o2 instanceof String)){
      throw new IllegalArgumentException();
    //}
    //return parameterOne;

    //throw new MethodNotImplementedException("findGreater");
  }



}
