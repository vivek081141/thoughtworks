package com.thoughtworks.recruitme.characterCount;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
  public static Map<Character, Integer> countCharacters(String string) {
    Map<Character, Integer> map = new HashMap<Character,Integer>();

    if(string==null || string.isEmpty()){
      return map;
    }

    char[] chars=string.toCharArray();

    for(char c:chars){
      if(!String.valueOf(c).trim().isEmpty()){
          Integer key=map.get(c);
          if(map.get(c)!=null){
            map.put(c,key+1);
          }else{
            map.put(c,1);
          }
      }
    }

    return map;
  }
}
