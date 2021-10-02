package com.epam.first.service;

import com.epam.first.model.Entity;

public class Division {
    private static Division instance = null;

    public static Division getInstance() {
        if (instance == null) {
            instance = new Division();
        }

        return instance;
    }

    private Division() {
    }

    public Entity division(Entity entity1, Entity entity2) {
        return new Entity(entity1.getValue().divide(entity2.getValue()));
    }
}
