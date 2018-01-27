package com.tekleo.blockchain_info.data_api.helpers;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static <E> List<E> fromOne(E value) {
        ArrayList<E> arrayList = new ArrayList<>();
        arrayList.add(value);
        return arrayList;
    }

    public static <E> List<E> toList(E[] valuesArray) {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E value : valuesArray)
            arrayList.add(value);
        return arrayList;
    }
}