package com.peter.pattern.singleton;
/**
This  is  the  most  widely  used  approach  for  Singleton  class  as  it  doesn’t   require synchronization. I am using this approach in many of my projects and  it’s  easy  to  understand  and  implement  also. 
 */
public class BillPughSingleton{
    private BillPughSingleton(){

    }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}