package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

public class BlockLatest {
    private String hash;
    private long time;
    private long block_index;
    private long height;
    private ArrayList<Long> txIndexes;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public BlockLatest(String hash, long time, long block_index, long height, ArrayList<Long> txIndexes) {
        this.hash = hash;
        this.time = time;
        this.block_index = block_index;
        this.height = height;
        this.txIndexes = txIndexes;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getHash() {
        return hash;
    }

    public long getTime() {
        return time;
    }

    public long getBlockIndex() {
        return block_index;
    }

    public long getHeight() {
        return height;
    }

    public ArrayList<Long> getTransactionsIndexes() {
        return txIndexes;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "BlockLatest{" +
                "hash='" + hash + '\'' +
                ", time=" + time +
                ", block_index=" + block_index +
                ", height=" + height +
                ", txIndexes=" + txIndexes +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}