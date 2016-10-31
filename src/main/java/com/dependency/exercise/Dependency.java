package com.dependency.exercise;

public class Dependency {
    private final String dependent;
    private final String on;

    public Dependency(String dependent, String on) {
        this.dependent = dependent;
        this.on = on;
    }
}
