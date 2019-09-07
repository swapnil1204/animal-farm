package com.thoughtworks.bootcamp;

public class Cow implements AnimalFarm {
    private String noise = "Moo";
    @Override
    public String makeNoise() {
        return noise;
    }
}
