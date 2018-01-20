package com.tekleo.blockchain_info.data_api.models;

public class Address {
    private String hash160;
    private String address;
    private long n_tx;
    private long n_unredeemed;
    private long total_received;
    private long total_sent;
    private long final_balance;
    private Transaction[] txs;
}