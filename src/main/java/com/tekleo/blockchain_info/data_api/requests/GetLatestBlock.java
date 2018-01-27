package com.tekleo.blockchain_info.data_api.requests;

import java.util.List;
import java.util.Map;

public class GetLatestBlock extends Get {
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
