package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    void givenDuckMakingNoise_WhenMake_ThenItShouldReturnQuack() {
        Duck duck = new Duck();
        Assertions.assertEquals("Quack", duck.makeNoise());
    }
}
