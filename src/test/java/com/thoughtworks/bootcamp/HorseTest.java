package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HorseTest {
    @Test
    void givenHorseMakingNoise_WhenMake_ThenItShouldReturnNeigh() {
        Horse horse = new Horse();
        Assertions.assertEquals("Neigh", horse.makeNoise());
    }
}
