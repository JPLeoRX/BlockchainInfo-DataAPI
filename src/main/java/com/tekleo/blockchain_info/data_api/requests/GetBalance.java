package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.helpers.ListUtils;
import com.tekleo.blockchain_info.data_api.helpers.MapUtils;
import com.tekleo.blockchain_info.data_api.helpers.StringUtils;

import java.util.List;
import java.util.Map;

public class GetBalance extends Get {
    private List<String> addresses;

    public GetBalance(List<String> addresses) {
        this.addresses = addresses;
    }

    public GetBalance(String ... addresses) {
        this(ListUtils.toList(addresses));
    }

    @Override
    public String getMethod() {
        return "/balance";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return MapUtils.fromOne("active", StringUtils.join(addresses, "%7C"));
    }
}