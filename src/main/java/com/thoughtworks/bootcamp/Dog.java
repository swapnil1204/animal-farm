package com.thoughtworks.bootcamp;

public class Dog implements AnimalFarm {
    private String noise = "Bark";

    @Override
    public String makeNoise() {
        return noise;
    }
}
