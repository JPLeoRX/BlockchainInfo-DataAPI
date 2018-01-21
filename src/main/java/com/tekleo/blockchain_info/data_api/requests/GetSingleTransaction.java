package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;

import java.util.List;
import java.util.Map;

public class GetSingleTransaction extends Get {
    private String transactionHash;

    public GetSingleTransaction(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    @Override
    public String getMethod() {
        return "/rawtx";
    }

    @Override
    public List<String> getArguments() {
        return ListUtils.fromOne(transactionHash);
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}