package com.epam.first.util.validator;

import com.epam.first.util.exception.NotNumberException;
import org.apache.commons.lang3.math.NumberUtils;

public class NumberValidator {
    private static final String BAD_STRING = "Isn't number!";
    public static NumberValidator instance = null;

    public static NumberValidator getInstance() {
        if (instance == null) {
            instance = new NumberValidator();
        }
        return instance;
    }

    private NumberValidator() {
    }

//    public boolean validator(String number) {
//        boolean isNumber = true;
//        try {
//            if (!NumberUtils.isCreatable(number)) {
//                isNumber = false;
//                throw new NotNumberException(BAD_STRING);
//            }
//        } catch (NotNumberException e) {
//            System.out.println(e.getMessage());
//        }
//        return isNumber;
//    }

    public boolean validator(String number) {
        boolean isNumber = true;
        try {
            if (!NumberUtils.isCreatable(number)) {
                isNumber = false;
                throw new NotNumberException(BAD_STRING);
            }
        } catch (NotNumberException e) {
            System.out.println(e.getMessage());
        }
        return isNumber;
    }
}
