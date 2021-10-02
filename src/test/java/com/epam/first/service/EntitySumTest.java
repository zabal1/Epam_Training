package com.epam.first.service;

import com.epam.first.model.Entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;



class EntitySumTest {
    @Test

    void sum() {
        BigDecimal value1 = BigDecimal.valueOf(1);
        BigDecimal value2 = BigDecimal.valueOf(2);
        BigDecimal resultvalue = BigDecimal.valueOf(3);
        Entity entity1 = new Entity(value1);
        Entity entity2 = new Entity(value2);
        Entity expectentity = new Entity(resultvalue);

        Entity nowentity = Sum.sum(entity1, entity2);

        Assertions.assertEquals(expectentity.getValue(), nowentity.getValue());
    }
}