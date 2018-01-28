package com.tekleo.blockchain_info.data_api.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Small helper methods to operate on {@link String}
 *
 * @author Leo Ertuna
 * @since 27.01.2018 20:20
 */
public class StringUtils {
    /**
     * Join several strings in one
     * @param words strings to be joined
     * @param deliminator deliminator is put after each next word
     * @return joined string
     */
    public static String join(List<String> words, String deliminator) {
        // If the list exists and it's not empty
        if (words != null && !words.isEmpty()) {
            // Create new string
            String joined = "";

            // Join words in it with added deliminator
            for (String word : words)
                joined += word + deliminator;

            // Remove the last deliminator
            joined = joined.substring(0, joined.length() - deliminator.length());

            // Return resulting string
            return joined;
        }

        // If there's something wrong with the list - throw an exception
        else {
            throw new IllegalArgumentException("List is null or empty");
        }
    }

    /**
     * Join map entries with key + delim + value approach and put them in a list
     * @param map map to be converted
     * @param keyValueDeliminator deliminator between key and value
     * @return list
     */
    public static List<String> toList(Map<String, String> map, String keyValueDeliminator) {
        // Create new list
        List<String> list = new ArrayList<>();

        // For each entry in the map
        for (Map.Entry<String, String> entry : map.entrySet())
            // Add key-value pair into the list with given deliminator
            list.add(entry.getKey() + keyValueDeliminator + entry.getValue());

        // Return resulting list
        return list;
    }

    /**
     * Join map entries into one string. key1 + kvDelim + value1 + pDelim + key2 + ... + valueN
     * @param map map to be joined
     * @param keyValueDeliminator deliminator between key and value
     * @param pairsDeliminator deliminator between each key-value pair
     * @return joined string
     */
    public static String join(Map<String, String> map, String keyValueDeliminator, String pairsDeliminator) {
        return join(toList(map, keyValueDeliminator), pairsDeliminator);
    }
}