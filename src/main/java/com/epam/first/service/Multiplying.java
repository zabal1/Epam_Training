package com.epam.first.service;

import com.epam.first.model.Entity;

public class Multiplying {
    private static Multiplying instance = null;

    public static Multiplying getInstance() {
        if(instance == null) {
            instance = new Multiplying();
        }

        return instance;
    }

    private Multiplying() {}

    public Entity multiply(Entity entity1, Entity entity2) {
        return new Entity(entity1.getValue().multiply(entity2.getValue()));
    }
}
