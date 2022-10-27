package com.epam.mjc.collections.combined;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int lengthOfWord = entry.getKey().length();
            Set<String> temp = resultMap.keySet().contains(lengthOfWord) ? resultMap.get(lengthOfWord) : new HashSet<>();
            temp.add(entry.getKey());
            resultMap.put(lengthOfWord, temp);
        }
        return resultMap;
    }
}
