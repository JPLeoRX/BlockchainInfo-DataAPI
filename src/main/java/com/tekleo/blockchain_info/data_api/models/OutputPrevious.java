package com.tekleo.blockchain_info.data_api.models;

public class OutputPrevious {
    private String hash;
    private String value;
    private String tx_index;
    private String n;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getHash() {
        return hash;
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
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "OutputPrevious{" +
                "hash='" + hash + '\'' +
                ", value='" + value + '\'' +
                ", tx_index='" + tx_index + '\'' +
                ", n='" + n + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}