package com.epam.second.parser.impl;

import com.epam.second.parser.StringToInt;
import com.epam.second.validator.StringValidator;
import com.epam.second.validator.impl.StringValidatorImpl;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringToIntImpl implements StringToInt {

    private static final Logger logger = LogManager.getLogger();
    @Override
    public int[] stringToArrayInt(String[] stringIntArray) {
        List<Integer> listInt = new ArrayList<>();

        for (String str : stringIntArray) {
            if(NumberUtils.isDigits(str)) {
                int value = Integer.parseInt(str);
                listInt.add(value);
            }
        }
        int[] resultArray = new int[0];

        if (listInt.size() == 0) {
            logger.error("File is empty");
        } else {
            resultArray = listInt.stream()
                    .mapToInt(i -> i)
                    .toArray();
        }
        return resultArray;
    }
}
