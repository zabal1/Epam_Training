package com.epam.second.service;

import com.epam.second.exception.ReaderException;
import com.epam.second.reader.ReaderFromFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReaderTest {
    private static final String EMPTY_FILE = "D:\\Zabal\\Epam traini\\Task1_array\\src\\test\\resources\\EmptyFile.txt";
    private static final String FILE_WITH_NUMBERS = "D:\\Zabal\\Epam traini\\Task1_array\\src\\test\\resources\\FileWithNumbers.txt";

    @Test
    void readerFromEmptyFile() {
        ReaderFromFile readerFromFile = ReaderFromFile.getInstance();

        Assertions.assertThrows(ReaderException.class, () -> readerFromFile.readString(EMPTY_FILE));
    }

    @Test
    void readerFromFile() throws ReaderException {
        ReaderFromFile readerFromFile = ReaderFromFile.getInstance();

        Assertions.assertEquals(3, readerFromFile.readString(FILE_WITH_NUMBERS).length);

    }
}
