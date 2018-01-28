package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.GetRequest;

import java.util.List;
import java.util.Map;

public class GetLatestBlock extends GetRequest {
    @Override
    public String getMethod() {
        return "/latestblock";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}
