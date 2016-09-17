package com.example.pattern.factory.implementations.strategyfactory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class StrategyFactoryTest {

    @Test
    public void shouldReturnCorrectStrategy() {
        Target target = new SomeTarget();
        Strategy strategy = StrategyFactory.get(target.getClass());
        String formatted = strategy.format(target);
        assertThat(formatted, equalTo("some target"));
    }
}
