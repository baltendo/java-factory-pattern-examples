package com.example.pattern.factory.implementations.strategyfactory;

import com.example.pattern.factory.implementations.ImmutableFactory;

class StrategyFactory {

    private static final ImmutableFactory<Class<? extends Target>, Strategy> delegate =
            ImmutableFactory.<Class<? extends Target>, Strategy>builder()
                    .register(SomeTarget.class, new SomeTargetStrategy())
                    .build();

    static Strategy get(Class<? extends Target> key) {
        return delegate.get(key);
    }
}
