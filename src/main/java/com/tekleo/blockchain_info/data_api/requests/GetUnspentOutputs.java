package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;
import com.tekleo.blockchain_info.data_api.helpers.MapUtils;
import com.tekleo.blockchain_info.data_api.helpers.StringUtils;

import java.util.List;
import java.util.Map;

public class GetUnspentOutputs extends Get {
    private List<String> addresses;
    private Integer limit;                      // Optional limit parameter to show n transactions e.g. &limit=50 (Default: 250, Max: 1000)
    private Integer confirmations;              // Optional confirmations parameter to limit the minimum confirmations e.g. &confirmations=6

    public GetUnspentOutputs(List<String> addresses) {
        this.addresses = addresses;
    }

    public GetUnspentOutputs(String ... addresses) {
        this(ListUtils.toList(addresses));
    }

    public void addParameterLimit(int limit) {
        this.limit = limit;
    }

    public void addParameterConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    @Override
    public String getMethod() {
        return "/unspent";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        Map<String, String> map = MapUtils.fromTwo("limit", limit, "confirmations", confirmations);
        map.put("active", StringUtils.join(addresses, "%7C"));
        return map;
    }
}