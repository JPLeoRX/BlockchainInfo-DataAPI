package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.MapUtils;

import java.util.List;
import java.util.Map;

public class GetUnconfirmedTransactions extends Get {
    @Override
    public String getMethod() {
        return "/unconfirmed-transactions";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return MapUtils.fromOne("format", "json");
    }
}
