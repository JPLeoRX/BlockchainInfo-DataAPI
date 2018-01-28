package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.GetRequest;
import com.tekleo.blockchain_info.data_api.utils.ListUtils;
import com.tekleo.blockchain_info.data_api.utils.MapUtils;
import com.tekleo.blockchain_info.data_api.utils.StringUtils;

import java.util.List;
import java.util.Map;

public class GetBalance extends GetRequest {
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