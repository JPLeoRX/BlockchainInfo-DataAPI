package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

public class Transaction {
    private String hash;
    private long ver;
    private long weight;
    private long block_height;
    private String relayed_by;
    private long lock_time;
    private long size;
    private boolean double_spend;
    private long time;
    private long tx_index;
    private long vin_sz;
    private long vout_sz;
    private ArrayList<Input> inputs;
    private ArrayList<Output> out;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Transaction(
            String hash, long ver, long weight, long block_height,
            String relayed_by, long lock_time, long size, boolean double_spend,
            long time, long tx_index, long vin_sz, long vout_sz,
            ArrayList<Input> inputs, ArrayList<Output> out) {
        this.hash = hash;
        this.ver = ver;
        this.weight = weight;
        this.block_height = block_height;
        this.relayed_by = relayed_by;
        this.lock_time = lock_time;
        this.size = size;
        this.double_spend = double_spend;
        this.time = time;
        this.tx_index = tx_index;
        this.vin_sz = vin_sz;
        this.vout_sz = vout_sz;
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

    public long getWeight() {
        return weight;
    }

    public long getBlockHeight() {
        return block_height;
    }

    public String getRelayedBy() {
        return relayed_by;
    }

    public long getLockTime() {
        return lock_time;
    }

    public long getSize() {
        return size;
    }

    public boolean isDoubleSpend() {
        return double_spend;
    }

    public long getTime() {
        return time;
    }

    public long getTransactionIndex() {
        return tx_index;
    }

    public long getVolumeInputSize() {
        return vin_sz;
    }

    public long getVolumeOutputSize() {
        return vout_sz;
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
                ", weight=" + weight +
                ", block_height=" + block_height +
                ", relayed_by='" + relayed_by + '\'' +
                ", lock_time=" + lock_time +
                ", size=" + size +
                ", double_spend=" + double_spend +
                ", time=" + time +
                ", tx_index=" + tx_index +
                ", vin_sz=" + vin_sz +
                ", vout_sz=" + vout_sz +
                ", inputs=" + inputs +
                ", out=" + out +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}