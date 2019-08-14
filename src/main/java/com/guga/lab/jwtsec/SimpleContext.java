package com.guga.lab.jwtsec;


public class SimpleContext {

    public static ThreadLocal<String> EMAIL;

    static {
        EMAIL = new ThreadLocal<>();
    }
}
