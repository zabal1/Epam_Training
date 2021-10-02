package com.epam.first.util.factory;

import com.epam.first.model.Entity;
import com.epam.first.util.validator.NumberValidator;

import java.math.BigDecimal;
import java.util.Optional;

public class EntityFactory {
    private static EntityFactory instance = null;
    public static final String Dot = ".";
    public static EntityFactory getInstance(){
        if (instance == null) {
            instance = new EntityFactory();
        }
        return instance;
    }

    private EntityFactory(){}

    public Optional<Entity> entityFactory(String number) {
        NumberValidator validator = NumberValidator.getInstance();
        Optional<Entity> entity = Optional.empty();
        if (validator.validator(number)) {
            BigDecimal num = new BigDecimal(number);

            return Optional.of(new Entity(num));
        }
        return entity;
    }
}
