package com.tekleo.blockchain_info.data_api.helpers;

import java.util.List;

public class StringUtils {
    public static String join(List<String> words, String deliminator) {
        if (words != null && !words.isEmpty()) {
            // Create new string
            String joined = "";

            // Join words in it
            for (String word : words)
                joined += word + deliminator;

            // Remove last deliminator
            joined = joined.substring(0, joined.length() - deliminator.length());

            return joined;
        }

        else {
            throw new IllegalArgumentException("List is null or empy");
        }
    }
}