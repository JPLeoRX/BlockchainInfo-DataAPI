package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.GetRequest;
import com.tekleo.blockchain_info.data_api.utils.ListUtils;
import com.tekleo.blockchain_info.data_api.utils.MapUtils;
import com.tekleo.blockchain_info.data_api.utils.StringUtils;

import java.util.List;
import java.util.Map;

public class GetMultiAddress extends GetRequest {
    private List<String> addresses;
    private Integer limit;                      // Optional limit parameter to show n transactions e.g. &limit=50 (Default: 50, Max: 100)
    private Integer offset;                     // Optional offset parameter to skip the first n transactions e.g. &offset=100 (Page 2 for limit 50)

    public GetMultiAddress(List<String> addresses) {
        this.addresses = addresses;
    }

    public GetMultiAddress(String ... addresses) {
        this(ListUtils.toList(addresses));
    }

    public void addParameterLimit(int limit) {
        this.limit = limit;
    }

    public void addParameterOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String getMethod() {
        return "/multiaddr";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        Map<String, String> map = MapUtils.toString(MapUtils.fromTwo("n", limit, "offset", offset));
        map.put("active", StringUtils.join(addresses, "%7C"));
        return map;
    }
}