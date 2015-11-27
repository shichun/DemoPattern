package com.peter.pattern;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.peter.pattern.decorator.Logger;

public class FileLogger implements Logger{
    public synchronized void log(String msg) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("log.txt", true));
            dos.writeBytes(msg);
            dos.close();
        } catch (FileNotFoundException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }
}
