package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

public class Block {
    private String hash;
    private long ver;
    private String prev_block;
    private String mrkl_root;
    private long time;
    private long bits;
    private long fee;
    private long nonce;
    private long n_tx;
    private long size;
    private long block_index;
    private boolean main_chain;
    private long height;
    private long received_time;
    private String relayed_by;
    private ArrayList<Transaction> tx;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Block(String hash, long ver, String prev_block, String mrkl_root, long time, long bits, long fee, long nonce, long n_tx, long size, long block_index, boolean main_chain, long height, long received_time, String relayed_by, ArrayList<Transaction> tx) {
        this.hash = hash;
        this.ver = ver;
        this.prev_block = prev_block;
        this.mrkl_root = mrkl_root;
        this.time = time;
        this.bits = bits;
        this.fee = fee;
        this.nonce = nonce;
        this.n_tx = n_tx;
        this.size = size;
        this.block_index = block_index;
        this.main_chain = main_chain;
        this.height = height;
        this.received_time = received_time;
        this.relayed_by = relayed_by;
        this.tx = tx;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getHash() {
        return hash;
    }

    public long getVersion() {
        return ver;
    }

    public String getPreviousBlock() {
        return prev_block;
    }

    public String getMerkelRoot() {
        return mrkl_root;
    }

    public long getTime() {
        return time;
    }

    public long getBits() {
        return bits;
    }

    public long getFee() {
        return fee;
    }

    public long getNonce() {
        return nonce;
    }

    public long getNumberOfTransactions() {
        return n_tx;
    }

    public long getSize() {
        return size;
    }

    public long getBlockIndex() {
        return block_index;
    }

    public boolean isMainChain() {
        return main_chain;
    }

    public long getHeight() {
        return height;
    }

    public long getReceivedTime() {
        return received_time;
    }

    public String getRelayedBy() {
        return relayed_by;
    }

    public ArrayList<Transaction> getTransactions() {
        return tx;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Block{" +
                "hash='" + hash + '\'' +
                ", ver=" + ver +
                ", prev_block='" + prev_block + '\'' +
                ", mrkl_root='" + mrkl_root + '\'' +
                ", time=" + time +
                ", bits=" + bits +
                ", fee=" + fee +
                ", nonce=" + nonce +
                ", n_tx=" + n_tx +
                ", size=" + size +
                ", block_index=" + block_index +
                ", main_chain=" + main_chain +
                ", height=" + height +
                ", received_time=" + received_time +
                ", relayed_by='" + relayed_by + '\'' +
                ", tx=" + tx +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}