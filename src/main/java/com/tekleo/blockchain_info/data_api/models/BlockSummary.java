package com.tekleo.blockchain_info.data_api.models;

public class BlockSummary {
    private long height;
    private String hash;
    private long time;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public long getHeight() {
        return height;
    }

    public String getHash() {
        return hash;
    }

    public long getTime() {
        return time;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "BlockSummary{" +
                "height=" + height +
                ", hash='" + hash + '\'' +
                ", time=" + time +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}