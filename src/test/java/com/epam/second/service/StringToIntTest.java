package com.epam.second.service;

import com.epam.second.parser.StringToInt;
import com.epam.second.parser.impl.StringToIntImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToIntTest {
    private static final String[] STRING_WITH_NUMBERS = {"1","2","3"};
    private static final String[] EMPTY_STRING = {""};

    @Test
    void stringToArrayIntUsingEmptyString() {
        StringToInt stringToInt = new StringToIntImpl();

        Assertions.assertEquals(0, stringToInt.stringToArrayInt(EMPTY_STRING).length);
    }

    @Test
    void stringToIntUsingStringWithNumbers() {
        StringToInt stringToInt = new StringToIntImpl();

        Assertions.assertEquals(3, stringToInt.stringToArrayInt(STRING_WITH_NUMBERS).length);
    }
}
