package com.tekleo.blockchain_info.data_api.helpers;

import com.tekleo.blockchain_info.data_api.utils.StringUtils;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void join() {
        List<String> a = new LinkedList<>();
        a.add("1"); a.add("2"); a.add("3");
        assertEquals("1, 2, 3", StringUtils.join(a, ", "));
        assertEquals("1|2|3", StringUtils.join(a, "|"));
    }
}