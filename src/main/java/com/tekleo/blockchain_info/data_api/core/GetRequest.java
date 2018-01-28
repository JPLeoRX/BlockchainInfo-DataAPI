package com.tekleo.blockchain_info.data_api.core;

/**
 * Get request in this REST client
 *
 * Specifies request type and base
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:23
 */
public abstract class GetRequest implements Request {
    @Override
    public Type getType() {
        return Type.GET;
    }

    @Override
    public String getBase() {
        return "https://blockchain.info";
    }
}