package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.ChartData;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetChartDataTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetChartData(ChartType.MARKET_PRICE_USD);
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        ChartData chartData = Parser.fromJson(json, ChartData.class);

        // Test basic data fields
        assertEquals("ok", chartData.getStatus());
        assertEquals("Market Price (USD)", chartData.getName());
        assertEquals("USD", chartData.getUnit());
        assertEquals("day", chartData.getPeriod());
        assertEquals("Average USD market price across major bitcoin exchanges.", chartData.getDescription());
    }

}