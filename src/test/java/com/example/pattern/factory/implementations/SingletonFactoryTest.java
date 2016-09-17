package com.example.pattern.factory.implementations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SingletonFactoryTest {

    @Test
    public void shouldAlwaysReturnSameInstance() {
        SingletonFactory one = SingletonFactory.instance();
        SingletonFactory two = SingletonFactory.instance();
        assertThat(one, equalTo(two));
    }
}