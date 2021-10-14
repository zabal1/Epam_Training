package com.epam.second.service;

import com.epam.second.validator.StringValidator;
import com.epam.second.validator.impl.StringValidatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    private static final String NUMBERS = "1;2;3";
    private static final String BAD_NUMBERS = "saq3";

    @Test
    void isValidTrue() {
        StringValidator stringValidator = new StringValidatorImpl();

        Assertions.assertTrue(stringValidator.isValid(NUMBERS));
    }

    @Test
    void isValidFalse() {
        StringValidator stringValidator = new StringValidatorImpl();

        Assertions.assertFalse(stringValidator.isValid(BAD_NUMBERS));
    }
}
