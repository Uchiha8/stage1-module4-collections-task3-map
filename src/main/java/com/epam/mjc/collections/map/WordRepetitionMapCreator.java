package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> maps = new HashMap<>();
        if (sentence == null || sentence.isEmpty()) {
            return maps;
        }
        for (String str : sentence.toLowerCase().split("\\s+")) {
            maps.put(str, maps.getOrDefault(str, 0) + 1);
        }
        return maps;
    }
}
