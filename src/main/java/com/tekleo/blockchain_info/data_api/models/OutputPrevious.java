package com.tekleo.blockchain_info.data_api.models;

public class OutputPrevious {
    private boolean spent;
    private long type;
    private String addr;
    private String value;
    private String tx_index;
    private String n;
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

    public String getValue() {
        return value;
    }

    public String getTransactionIndex() {
        return tx_index;
    }

    public String getN() {
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