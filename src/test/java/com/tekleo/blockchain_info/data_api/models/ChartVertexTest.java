package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChartVertexTest {
    @Test
    public void test() {
        String json = "{\n" +
                "            \"x\" : 1290602498, //Unix timestamp\n" +
                "            \"y\" : 1309696.2116000003\n" +
                "        }";

        ChartVertex chartVertex = Parser.fromJson(json, ChartVertex.class);
        assertEquals(1290602498, chartVertex.getX());
        assertEquals(1309696.2116000003, chartVertex.getY(), Double.MIN_VALUE);
    }
}