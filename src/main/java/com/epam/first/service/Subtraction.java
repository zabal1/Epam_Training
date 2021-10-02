package com.epam.first.service;

import com.epam.first.model.Entity;

public class Subtraction {
    private static Subtraction instance = null;

    public static Subtraction getInstance() {
        if (instance == null) {
            instance = new Subtraction();
        }

        return instance;
    }

    private Subtraction() {}

    public Entity substract(Entity entity1, Entity entity2){
        return new Entity(entity1.getValue().subtract(entity2.getValue()));
    }
}




