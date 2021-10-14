package com.epam.second.service;

import com.epam.second.service.actions.CalculationService;
import com.epam.second.service.actions.SortService;
import com.epam.second.service.actions.impl.CalculationServiceImpl;
import com.epam.second.service.sort.SortServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortServiceTest {

    @Test
    void bubbleSortService() {
        int[] b = {3, 1, 2};
        int[] a = {1, 2, 3};
        SortService sortService = new SortServiceImpl();

        Assertions.assertEquals(Arrays.toString(a), Arrays.toString(sortService.bubbleSort(b)));
    }

    @Test
    void shuttleSortService() {
        int[] b = {3, 1, 2};
        int[] a = {1, 2, 3};
        SortService sortService = new SortServiceImpl();

        Assertions.assertEquals(Arrays.toString(a), Arrays.toString(sortService.shuttleSort(b)));
    }

    @Test
    void insertionSortService() {
        int[] b = {3, 1, 2};
        int[] a = {1, 2, 3};
        SortService sortService = new SortServiceImpl();

        Assertions.assertEquals(Arrays.toString(a), Arrays.toString(sortService.insertionSort(b)));
    }
}
