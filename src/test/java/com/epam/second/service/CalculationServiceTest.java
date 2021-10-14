package com.epam.second.service;

import com.epam.second.service.actions.CalculationService;
import com.epam.second.service.actions.impl.CalculationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CalculationServiceTest {

    @Test
    void avgTest() {
        int[] b = {1, 2, 3};
        int a = 2;
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(a, calculationService.avg(b));
    }

    @Test
    void avgStreamTest() {
        int[] b = {1, 2, 3};
        int a = 2;
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(a, calculationService.avgStream(b));
    }

    @Test
    void maxTest() {
        int[] b = {1, 2, 3};
        int a = 3;
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(a, calculationService.max(b));
    }

    @Test
    void maxStreamTest() {
        int[] b = {1, 2, 3};
        int a = 3;
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(a, calculationService.maxStream(b));
    }

    @Test
    void minTest() {
        int[] b = {1, 2, 3};
        int a = 1;
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(a, calculationService.min(b));
    }

    @Test
    void minStreamTest() {
        int[] b = {1, 2, 3};
        int a = 1;
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(a, calculationService.minStream(b));
    }

    @Test
    void replaceNegativeTest() {
        int[] b = {1, -2, -3};
        int[] a = {1, 2, 3};
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(Arrays.toString(a), Arrays.toString(calculationService.replaceNegative(b)));
    }

    @Test
    void replaceNegativeStreamTest() {
        int[] b = {1, -2, -3};
        int[] a = {1, 2, 3};
        CalculationService calculationService = new CalculationServiceImpl();

        Assertions.assertEquals(Arrays.toString(a), Arrays.toString(calculationService.replaceNegativeStream(b)));
    }
}
