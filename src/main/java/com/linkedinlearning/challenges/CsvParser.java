package com.linkedinlearning.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CsvParser {

  Map<Integer, String> parse(String fileName) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    Map<Integer, String> map = reader.lines().map(line -> line.split(","))
        .collect(Collectors.groupingBy(line -> Integer.parseInt(line[0]),
            Collectors.mapping(line -> line[1], Collectors.joining(", "))));

    /*List<String> lines = reader.lines().collect(Collectors.toList());
    Map<Integer, String> map = lines
        .stream()
        .map(line -> line.split(","))
        .collect(Collectors.groupingBy(line -> Integer.parseInt(line[0]),
            Collectors.mapping(line -> line[1], Collectors.joining(", "))));*/
    reader.close();
    return map;
  }
}
