package com.peter.pattern;

import com.peter.pattern.decorator.Logger;

public class ConsoleLogger implements Logger {
    public void log(String msg) {
        System.out.println(msg);
    }
}
