package com.epam.first.model;

import java.math.BigDecimal;
public class Entity {
    private BigDecimal value;
    private BigDecimal entity;

    public Entity(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getEntity() {
        return entity;
    }

    public void setEntity(BigDecimal entity) {
        this.entity = entity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Entity{" +
                "value=" + value +
                '}';
    }
}
