package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChartDataTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"values\" : [\n" +
                "        {\n" +
                "            \"x\" : 1290602498, //Unix timestamp\n" +
                "            \"y\" : 1309696.2116000003\n" +
                "        }]\n" +
                "}";
    }
}