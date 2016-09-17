package com.example.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public class BasicFactory<K, V> implements Factory<K, V> {

    private final Map<K, V> mapping;

    protected BasicFactory() {
        mapping = new HashMap<>();
    }

    public void register(K key, V value) {
        mapping.put(key, value);
    }

    public V get(K key) {
        V value = mapping.get(key);

        if (value == null) {
            throw new IllegalArgumentException("missing");
        }

        return mapping.get(key);
    }
}
