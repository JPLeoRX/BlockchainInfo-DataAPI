package com.tekleo.blockchain_info.data_api.models;

public class Transaction {
    private String hash;
    private long ver;
    private long vin_sz;
    private long vout_sz;
    private String lock_time;
    private long size;
    private String relayed_by;
    private long block_height;
    private String tx_index;
    private Input[] inputs;
    private Output[] out;
}