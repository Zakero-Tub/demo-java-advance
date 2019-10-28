package com.example.demo.services;

public class SingletoneClasstest {
    private static SingletoneClasstest instance;
    public static final String TEST_CONSTANT = "Test";
    private SingletoneClasstest(){

    }

    public static SingletoneClasstest getInstance(){
        if(null == instance) {
            instance = new SingletoneClasstest();
        }
            return instance;
    }


}
