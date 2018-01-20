package com.tekleo.blockchain_info.data_api.models;

public class OutputUnspent {
    private String tx_age;
    private String tx_hash;
    private String tx_index;
    private String tx_output_n;
    private String script;
    private String value;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getTransactionAge() {
        return tx_age;
    }

    public String getTransactionHash() {
        return tx_hash;
    }

    public String getTransactionIndex() {
        return tx_index;
    }

    public String getTransactionNumberOfOutputs() {
        return tx_output_n;
    }

    public String getScript() {
        return script;
    }

    public String getValue() {
        return value;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "OutputUnspent{" +
                "tx_age='" + tx_age + '\'' +
                ", tx_hash='" + tx_hash + '\'' +
                ", tx_index='" + tx_index + '\'' +
                ", tx_output_n='" + tx_output_n + '\'' +
                ", script='" + script + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}