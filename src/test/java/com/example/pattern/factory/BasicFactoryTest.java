package com.example.pattern.factory;

import org.junit.Test;
import org.omg.CORBA.Object;

public class BasicFactoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNoMappingFound() {
        String key = "key";
        Factory<String, Object> factory = new BasicFactory<>();
        factory.get(key);
    }
}