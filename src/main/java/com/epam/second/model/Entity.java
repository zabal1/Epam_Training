package com.epam.second.model;


import java.util.Arrays;

public class Entity {
    private int[] customArray;

    public Entity(int[] array) {
        this.customArray = array;
    }

    public int[] getCustomArray() {
        return customArray;
    }

    public void setCustomArray(int[] customArray) {
        this.customArray = customArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Entity that = (Entity) o;

        return Arrays.equals(customArray, that.customArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customArray);
    }

    @Override
    public String toString() {
        return "CustomArray" + Arrays.toString(customArray);
    }
}