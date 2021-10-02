package com.epam.first.service;

import com.epam.first.model.Entity;

public class Sum {
    private static Sum instance = null;

    public static Sum getInstance() {
        if (instance == null) {
            instance = new Sum();
        }

        return instance;
    }

    private Sum() {
    }

    public static Entity sum(Entity entity1, Entity entity2) {
        return new Entity(entity1.getValue().add(entity2.getValue()));
    }


}
