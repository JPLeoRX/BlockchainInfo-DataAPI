package com.tekleo.blockchain_info.data_api.models;

public class OutputPrevious {
    private boolean spent;
    private long type;
    private String addr;
    private long value;
    private long tx_index;
    private long n;
    private String script;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public boolean isSpent() {
        return spent;
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

    public long getTransactionIndex() {
        return tx_index;
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
        return "OutputPrevious{" +
                "spent=" + spent +
                ", type=" + type +
                ", addr='" + addr + '\'' +
                ", value='" + value + '\'' +
                ", tx_index='" + tx_index + '\'' +
                ", n='" + n + '\'' +
                ", script='" + script + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}