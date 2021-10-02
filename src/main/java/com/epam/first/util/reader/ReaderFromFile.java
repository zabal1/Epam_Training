package com.epam.first.util.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

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

    public String[] readString(String stringPath) throws IOException {
//        Scanner sc = new Scanner(new File(input.txt));
//        List<String> lines = new ArrayList<String>();
//        while (sc.hasNextLine()) {
//            lines.add(sc.nextLine());
//        }
//
//        String[] arr = lines.toArray(new String[0])

        BufferedReader reader = new BufferedReader(new FileReader(stringPath));

        StringBuffer stringBuffer = new StringBuffer();
        String line;

        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line + " ");
        }

        String[] arr = stringBuffer.toString().split(" ");
        return arr;
    }
}
