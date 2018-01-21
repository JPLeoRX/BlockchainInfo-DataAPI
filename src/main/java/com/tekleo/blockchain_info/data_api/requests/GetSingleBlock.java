package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;

import java.util.List;
import java.util.Map;

public class GetSingleBlock extends Get {
    private String blockHash;

    public GetSingleBlock(String blockHash) {
        this.blockHash = blockHash;
    }

    @Override
    public String getMethod() {
        return "/rawblock";
    }

    @Override
    public List<String> getArguments() {
        return ListUtils.fromOne(blockHash);
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}