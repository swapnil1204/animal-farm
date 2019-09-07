package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CowTest {
    @Test
    void givenCowMakingNoise_WhenMake_ThenItShouldReturnMoo() {
        Cow cow = new Cow();
        Assertions.assertEquals("Moo", cow.makeNoise());
    }
}
