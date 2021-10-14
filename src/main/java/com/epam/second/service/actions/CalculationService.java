package com.epam.second.service.actions;

public interface CalculationService {
    int avg(int[] array);

    double avgStream(int[] array);

    int max(int[] array);

    int maxStream(int[] array);


    int min(int[] array);

    int minStream(int[] array);

    int[] replaceNegative(int[] array);

    int[] replaceNegativeStream(int[] array);

}
