package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> maps = new HashMap<>();
        for (String str : List.of(sentence.split(" "))) {
            maps.put(str.toLowerCase(), maps.containsKey(str.toLowerCase()) ? maps.get(str.toLowerCase()) + 1 : 1);
        }
        return maps;
    }
}
