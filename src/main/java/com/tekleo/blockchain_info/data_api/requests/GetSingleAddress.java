package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;
import com.tekleo.blockchain_info.data_api.helpers.MapUtils;

import java.util.List;
import java.util.Map;

public class GetSingleAddress extends Get {
    private String bitcoinAddress;
    private Integer limit;                      // Optional limit parameter to show n transactions e.g. &limit=50 (Default: 50, Max: 50)
    private Integer offset;                     // Optional offset parameter to skip the first n transactions e.g. &offset=100 (Page 2 for limit 50)

    public GetSingleAddress(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    public void addParameterLimit(int limit) {
        this.limit = limit;
    }

    public void addParameterOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String getMethod() {
        return "/rawaddr";
    }

    @Override
    public List<String> getArguments() {
        return ListUtils.fromOne(bitcoinAddress);
    }

    @Override
    public Map<String, String> getParameters() {
        return MapUtils.fromTwo("limit", limit, "offset", offset);
    }
}