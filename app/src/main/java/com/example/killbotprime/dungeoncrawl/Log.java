package com.example.killbotprime.dungeoncrawl;

import java.util.LinkedList;

public class Log {
    static LinkedList<String> log = new LinkedList<>();

    public static void write(String message){
        log.add(message);
        System.out.println(message);
    }


}
