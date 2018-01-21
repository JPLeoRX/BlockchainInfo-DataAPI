package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.Request;

public abstract class Get implements Request {
    @Override
    public Type getType() {
        return Type.GET;
    }
}