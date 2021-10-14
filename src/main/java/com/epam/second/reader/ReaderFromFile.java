package com.epam.second.reader;

import com.epam.second.exception.ReaderException;
import com.epam.second.validator.StringValidator;
import com.epam.second.validator.impl.StringValidatorImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFile {
    private static ReaderFromFile instance = null;

    public static ReaderFromFile getInstance() {
        if (instance == null) {
            instance = new ReaderFromFile();
        }
        return instance;
    }

    private ReaderFromFile() {
    }

    public String[] readString(String stringPath) throws ReaderException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(stringPath));

            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append(";");
            }
            StringValidator validator = new StringValidatorImpl();
            if (validator.isValid(stringBuilder.toString()))
                return stringBuilder.toString().split(";");
            else throw new ReaderException();
        } catch (IOException e) {
            throw new ReaderException(e);
        }
    }
}
