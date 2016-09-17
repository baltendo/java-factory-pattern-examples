package com.example.pattern.factory.implementations;

import com.example.pattern.factory.Factory;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ImmutableFactoryTest {

    @Test
    public void shouldReturnCorrectObject() {
        String key = "key";
        Object value = new Object();
        Factory<String, Object> factory = ImmutableFactory.<String, Object>builder()
                .register(key, value)
                .build();
        Object result = factory.get(key);
        assertThat(result, equalTo(value));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionOnRegister() {
        String key = "key";
        Object value = new Object();
        Factory<String, Object> factory = ImmutableFactory.<String, Object>builder()
                .register(key, value)
                .build();
        factory.register(key, value);
    }
}