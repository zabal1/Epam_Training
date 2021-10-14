package com.epam.second.main;

import com.epam.second.exception.ReaderException;
import com.epam.second.model.Entity;
import com.epam.second.parser.StringToInt;
import com.epam.second.parser.impl.StringToIntImpl;
import com.epam.second.reader.ReaderFromFile;
import com.epam.second.service.actions.CalculationService;
import com.epam.second.service.actions.SortService;
import com.epam.second.service.actions.impl.CalculationServiceImpl;
import com.epam.second.service.sort.SortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws ReaderException {
        SortService sortService = new SortServiceImpl();
        StringToInt stringToInt = new StringToIntImpl();
        ReaderFromFile readerFromFile = ReaderFromFile.getInstance();
        String[] str1 = readerFromFile.readString("./src/main/resources/input.txt");
        Entity entity = new Entity(stringToInt.stringToArrayInt(str1));
        System.out.println(Arrays.toString(entity.getCustomArray()));
        logger.info(Arrays.toString(sortService.bubbleSort(entity.getCustomArray())));
    }
}
