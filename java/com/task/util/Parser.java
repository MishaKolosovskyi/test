package com.task.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parser {

     void parse(String path) throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(path));
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
            for (CSVRecord csvRecord : csvParser) {
                String productId = csvRecord.get(1);
                String userId = csvRecord.get(2);
                String profileName = csvRecord.get(3);
                String helpfulnessNumerator = csvRecord.get(4);
                String helpfulnessDenominator = csvRecord.get(5);
                String score = csvRecord.get(6);
                String time = csvRecord.get(7);
                String summary = csvRecord.get(8);
                String text = csvRecord.get(9);
            }
        }
    }
}
