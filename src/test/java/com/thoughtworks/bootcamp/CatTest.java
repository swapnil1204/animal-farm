package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    void givenCatMakeNoise_WhenMake_ThenItShouldReturnMeow() {
        Cat cat = new Cat();
        Assertions.assertEquals("Meow", cat.makeNoise());
    }
}
