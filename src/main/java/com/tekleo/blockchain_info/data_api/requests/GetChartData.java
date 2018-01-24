package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;
import com.tekleo.blockchain_info.data_api.helpers.MapUtils;

import java.util.List;
import java.util.Map;

public class GetChartData extends Get {
    private ChartType chartType;

    public GetChartData(ChartType chartType) {
        this.chartType = chartType;
    }

    @Override
    public String getMethod() {
        return "/charts";
    }

    @Override
    public List<String> getArguments() {
        return ListUtils.fromOne(chartType.getRestName());
    }

    @Override
    public Map<String, String> getParameters() {
        return MapUtils.fromOne("format", "json");
    }
}