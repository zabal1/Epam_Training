package com.epam.first.main;

import com.epam.first.model.Entity;
import com.epam.first.service.Sum;
import com.epam.first.util.factory.EntityFactory;
import com.epam.first.util.reader.ReaderFromFile;
import com.epam.first.util.validator.NumberValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        ReaderFromFile reader = ReaderFromFile.getInstance();
        EntityFactory factory = EntityFactory.getInstance();
        NumberValidator numberValidator = NumberValidator.getInstance();
        Sum sum = Sum.getInstance();
        Entity sumResult = new Entity(new BigDecimal("0"));
//        String[] text = new String[20];
        List <String> text = new LinkedList<>();
        try {
            text = Arrays.asList(reader.readString("./src/main/resources/input.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : text) {
            System.out.println(s + " - " + numberValidator.validator(s));

            if (factory.entityFactory(s).isPresent()) {
                BigDecimal bigDecimal = new BigDecimal(s);
                sumResult = Sum.sum(sumResult, new Entity(bigDecimal));
                logger.info(sumResult);
            }


        }
    }
}
