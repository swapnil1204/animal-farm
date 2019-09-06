package com.thoughtworks.bootcamp;

public class Horse implements AnimalFarm {
    private String noise = "Neigh";

    @Override
    public String makeNoise() {
        return noise;
    }
}
