package com.tekleo.blockchain_info.data_api.models;

public class Block {
    private String hash;
    private long ver;
    private String prev_block;
    private String mrkl_root;
    private long time;
    private long bits;
    private long nonce;
    private long n_tx;
    private long size;
    private long block_index;
    private boolean main_chain;
    private long height;
    private long received_time;
    private String relayed_by;
    private Transaction[] tx;
}