package com.tekleo.blockchain_info.data_api.models;

public class Output {
    private boolean spent;
    private long tx_index;
    private long type;
    private String addr;
    private long value;
    private long n;
    private String script;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public boolean isSpent() {
        return spent;
    }

    public long getTransactionIndex() {
        return tx_index;
    }

    public long getType() {
        return type;
    }

    public String getAddress() {
        return addr;
    }

    public long getValue() {
        return value;
    }

    public long getN() {
        return n;
    }

    public String getScript() {
        return script;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Output{" +
                "spent=" + spent +
                ", tx_index=" + tx_index +
                ", type=" + type +
                ", addr='" + addr + '\'' +
                ", value=" + value +
                ", n=" + n +
                ", script='" + script + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}