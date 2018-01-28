package com.tekleo.blockchain_info.data_api.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Small helper methods to operate on {@link List}
 *
 * @author Leo Ertuna
 * @since 21.01.2018 02:53
 */
public class ListUtils {
    /**
     * Create a list from just one element
     * @param element element of the list
     * @return list
     */
    public static <E> List<E> fromOne(E element) {
        ArrayList<E> arrayList = new ArrayList<>();
        arrayList.add(element);
        return arrayList;
    }

    /**
     * Convert array of objects to a list
     * @param elements elements of the list
     * @return list
     */
    public static <E> List<E> toList(E[] elements) {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E value : elements)
            arrayList.add(value);
        return arrayList;
    }
}