package com.peter.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbstractFactory {
    public static void main(String[] args) {
        String input = "User clientId=23421. Some more text clientId=33432. This clientNum=100";

        Pattern p = Pattern.compile("(clientId=)(\\d+)");
        Matcher m = p.matcher(input);

        StringBuffer result = new StringBuffer();
        while (m.find()) {
            System.out.println(m.group(1));
            System.out.println("Masking: " + m.group(2));
            System.out.println(result);
            m.appendReplacement(result, m.group(1) + "***masked***");
        }
        m.appendTail(result);
        System.out.println(result);
    }
}
