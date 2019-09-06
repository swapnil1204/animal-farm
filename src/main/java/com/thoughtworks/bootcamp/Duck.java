package com.thoughtworks.bootcamp;

public class Duck implements AnimalFarm {
    private String noise = "Quack";

    @Override
    public String makeNoise() {
        return noise;
    }
}
