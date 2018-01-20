package com.thoughtworks.recruitme.duplicateStringProblem;

import java.util.*;

public class UniqueList {
  public static List<String> deDuplicate(List<String> list) {
    List<String> uniqueList=new ArrayList<String>();
    Map<String,String> uniqueMap=new HashMap<String,String>();

    for(String s: list){
        String key=uniqueMap.get(s);
        if(key==null){
          uniqueMap.put(s,s);
          uniqueList.add(s);
        }
    }
    return uniqueList;
  }
}
