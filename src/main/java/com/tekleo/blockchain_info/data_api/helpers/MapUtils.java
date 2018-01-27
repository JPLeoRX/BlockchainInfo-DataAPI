package com.tekleo.blockchain_info.data_api.helpers;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static <K, V> Map<K, V> fromOne(K key, V value) {
        HashMap<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static <V> Map<String, String> fromTwo(String key1, V value1, String key2, V value2) {
        HashMap<String, String> map = new HashMap<>();

        if (value1 != null)
            map.put(key1, value1.toString());

        if (value2 != null)
            map.put(key2, value2.toString());

        return map;
    }


}