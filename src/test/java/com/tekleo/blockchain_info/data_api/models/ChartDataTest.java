package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

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

        ChartData chartData = Parser.fromJson(json, ChartData.class);
        //ChartVertex chartVertex = chartData.get(0);
        //assertEquals(1290602498, chartVertex.getX());
        //assertEquals(1309696.2116000003, chartVertex.getY(), Double.MIN_VALUE);
    }
}