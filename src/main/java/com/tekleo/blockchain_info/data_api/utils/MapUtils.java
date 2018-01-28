package com.tekleo.blockchain_info.data_api.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Small helper methods to operate on {@link Map}
 *
 * @author Leo Ertuna
 * @since 25.01.2018 00:17
 */
public class MapUtils {
    /**
     * Create a map from just one key-value pair
     * @param key key
     * @param value value
     * @return new map
     */
    public static <K, V> Map<K, V> fromOne(K key, V value) {
        // Create new map
        HashMap<K, V> map = new HashMap<>();

        // If both key and value exist
        if (key != null && value != null)
            map.put(key, value);

        return map;
    }

    /**
     * Create a map from only two key-value pairs
     * @param key1 1st key
     * @param value1 1st value
     * @param key2 2nd key
     * @param value2 2nd value
     * @return
     */
    public static <K, V> Map<K, V> fromTwo(K key1, V value1, K key2, V value2) {
        // Create new map
        HashMap<K, V> map = new HashMap<>();

        // 1st) If both key and value exist
        if (value1 != null)
            map.put(key1, value1);

        // 2nd) If both key and value exist
        if (value2 != null)
            map.put(key2, value2);

        return map;
    }

    /**
     * Convert both key and value objects to strings
     * @param map existing map
     * @return map of strings
     */
    public static <K, V> Map<String, String> toString(Map<K, V> map) {
        // Create new map
        Map<String, String> strMap = new HashMap<>();

        // For each existing entry
        for (Map.Entry<K, V> entry : map.entrySet())
            // Add new entry with converted key-value
            strMap.put(entry.getKey().toString(), entry.getValue().toString());

        return strMap;
    }
}