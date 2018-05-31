package com.peter.pattern.singleton;
import java.io.Serializable; 
public class SerializedSingleton  implements Serializable{
    private SerializedSingleton(){

    }
    private static class SingletonHelper{
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve() {     return getInstance(); } 
 
}