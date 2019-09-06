package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    void givenDogMakingNoise_WhenMake_ThenItShouldReturnBark() {
        Dog dog = new Dog();
        Assertions.assertEquals("Bark", dog.makeNoise());
    }

    @Test
    void givenHorseMakingNoise_WhenMake_ThenItShouldReturnNeigh() {
        Horse horse = new Horse();
        Assertions.assertEquals("Neigh", horse.makeNoise());
    }
}
