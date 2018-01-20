package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

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
    private ArrayList<Input> inputs;
    private ArrayList<Output> out;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Transaction(String hash, long ver, long vin_sz, long vout_sz, String lock_time, long size, String relayed_by, long block_height, String tx_index, ArrayList<Input> inputs, ArrayList<Output> out) {
        this.hash = hash;
        this.ver = ver;
        this.vin_sz = vin_sz;
        this.vout_sz = vout_sz;
        this.lock_time = lock_time;
        this.size = size;
        this.relayed_by = relayed_by;
        this.block_height = block_height;
        this.tx_index = tx_index;
        this.inputs = inputs;
        this.out = out;
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

    public long getVolumeInputSize() {
        return vin_sz;
    }

    public long getVolumeOutputSize() {
        return vout_sz;
    }

    public String getLockTime() {
        return lock_time;
    }

    public long getSize() {
        return size;
    }

    public String getRelayedBy() {
        return relayed_by;
    }

    public long getBlockHeight() {
        return block_height;
    }

    public String getTransactionIndex() {
        return tx_index;
    }

    public ArrayList<Input> getInputs() {
        return inputs;
    }

    public ArrayList<Output> getOutputs() {
        return out;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Transaction{" +
                "hash='" + hash + '\'' +
                ", ver=" + ver +
                ", vin_sz=" + vin_sz +
                ", vout_sz=" + vout_sz +
                ", lock_time='" + lock_time + '\'' +
                ", size=" + size +
                ", relayed_by='" + relayed_by + '\'' +
                ", block_height=" + block_height +
                ", tx_index='" + tx_index + '\'' +
                ", inputs=" + inputs +
                ", out=" + out +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}