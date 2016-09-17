package com.example.pattern.factory.implementations;

import com.example.pattern.factory.BasicFactory;

public class ImmutableFactory<K, V> extends BasicFactory<K, V> {

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    private ImmutableFactory() {
        // not allowed
    }

    @Override
    public void register(K key, V value) {
        throw new UnsupportedOperationException();
    }

    private void registerBuilder(K key, V value) {
        super.register(key, value);
    }

    public static class Builder<K, V> {
        private ImmutableFactory<K, V> instance;

        private Builder() {
            instance = new ImmutableFactory<>();
        }

        public Builder<K, V> register(K key, V value) {
            instance.registerBuilder(key, value);
            return this;
        }

        public ImmutableFactory<K, V> build() {
            return instance;
        }
    }
}
