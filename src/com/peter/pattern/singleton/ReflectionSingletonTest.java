package com.peter.pattern.singleton;
import java.lang.reflect.Constructor;

public class ReflectionSingletonTest{
    public static void main(String[] args){
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try{
          Constructor[] constructors =  EagerInitializedSingleton.class.getDeclaredConstructors();
          for(Constructor constructor:constructors){
               //Below code will destroy the singleton pattern   
              constructor.setAccessible(true);
             EagerInitializedSingleton instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
          }
        }catch(Exception e) {             e.printStackTrace();         }         System.out.println(instanceOne.hashCode());         System.out.println(instanceTwo.hashCode()); 
    }
}