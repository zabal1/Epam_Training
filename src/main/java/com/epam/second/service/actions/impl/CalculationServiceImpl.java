package com.epam.second.service.actions.impl;

import com.epam.second.service.actions.CalculationService;

import java.util.stream.IntStream;

public class CalculationServiceImpl implements CalculationService {

    @Override
    public int avg(int[] array) {

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    @Override
    public double avgStream(int[] array) {
        return IntStream.of(array)
                .average()
                .orElse(Double.NaN);

    }

    @Override
    public int max(int[] array) {
        int max = array[0];
        for (int numMax = 1; numMax < array.length; numMax++) {
            if (array[numMax] > max) {
                max = array[numMax];
            }
        }
        return max;
    }

    @Override
    public int maxStream(int[] array) {
        return IntStream.of(array)
                .max()
                .getAsInt();
    }

    @Override
    public int min(int[] array) {
        int min = array[0];
        for (int numMin = 1; numMin < array.length; numMin++) {
            if (min > array[numMin]) {
                min = array[numMin];
            }
        }
        return min;
    }

    @Override
    public int minStream(int[] array) {
        return IntStream.of(array)
                .min()
                .getAsInt();
    }

    @Override
    public int[] replaceNegative(int[] array) {
        for (int num = 0; num < array.length; num++) {
            if (array[num] < 0) {
                array[num] = array[num] * (-1);
            }
        }
        return array;
    }

    @Override
    public int[] replaceNegativeStream(int[] array) {
        return IntStream.of(array)
                .map(Math::abs)
                .toArray();
    }
}

