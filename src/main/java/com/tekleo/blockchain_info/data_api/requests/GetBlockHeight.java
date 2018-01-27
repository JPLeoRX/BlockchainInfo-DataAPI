package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;
import com.tekleo.blockchain_info.data_api.helpers.MapUtils;

import java.util.List;
import java.util.Map;

public class GetBlockHeight extends Get {
    private long blockHeight;

    public GetBlockHeight(long blockHeight) {
        this.blockHeight = blockHeight;
    }

    @Override
    public String getMethod() {
        return "/block-height";
    }

    @Override
    public List<String> getArguments() {
        return ListUtils.fromOne(String.valueOf(blockHeight));
    }

    @Override
    public Map<String, String> getParameters() {
        return MapUtils.fromOne("format", "json");
    }
}