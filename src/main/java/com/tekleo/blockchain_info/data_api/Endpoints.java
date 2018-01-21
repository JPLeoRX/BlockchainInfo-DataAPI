package com.tekleo.blockchain_info.data_api;

public class Endpoints {
    public static final String BASE = "https://blockchain.info";

    public static String getUrl(String method) {
        return BASE + method;
    }
}