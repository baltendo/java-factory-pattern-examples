package com.example.pattern.factory.implementations;

import com.example.pattern.factory.BasicFactory;

public class SingletonFactory extends BasicFactory<String, Object> {

    private static final SingletonFactory INSTANCE = new SingletonFactory();

    private SingletonFactory() {
        // not allowed
    }

    public static SingletonFactory instance() {
        return INSTANCE;
    }
}
