package com.thoughtworks.recruitme.primes;

import java.util.ArrayList;
import java.util.List;

public class Prime {

  public List<Integer> findPrimes(int n) {
    List<Integer> integers=new ArrayList<Integer>();
    for(int i=0;i<=n;i++){
      if(isPrime(i)){
        integers.add(i);
      }
    }
    return integers;
  }


  private static boolean isPrime(int num) {
    if (num < 2){
      return false;
    }
    if (num == 2){
      return true;
    }

    if(num % 2 ==0){
      return  false;
    }

    boolean flag=true;
    for (int i = 2; i  < num; i += 1){
      if(num%i==0){
        flag =false;
      }
    }
      return flag;
  }
}
