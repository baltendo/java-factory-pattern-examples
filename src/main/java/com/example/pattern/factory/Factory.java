package com.example.pattern.factory;

public interface Factory<K, V> {

    void register(K key, V value);

    V get(K key);
}
