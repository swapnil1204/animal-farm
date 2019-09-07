package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigTest {
    @Test
    void givenPigMakeNoise_WhenMake_ThenItShouldReturnOink() {
        Pig pig = new Pig();
        assertEquals("Oink", pig.makeNoise());
    }
}
