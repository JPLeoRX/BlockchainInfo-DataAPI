package com.tekleo.blockchain_info.data_api.models;

public class OutputUnspent {
    private String tx_hash;
    private String tx_hash_big_endian;
    private long tx_index;
    private long tx_output_n;
    private String script;
    private long value;
    private String value_hex;
    private long confirmations;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getTransactionHash() {
        return tx_hash;
    }

    public String getTransactionHashBigEndian() {
        return tx_hash_big_endian;
    }

    public long getTransactionIndex() {
        return tx_index;
    }

    public long getTransactionNumberOfOutputs() {
        return tx_output_n;
    }

    public String getScript() {
        return script;
    }

    public long getValue() {
        return value;
    }

    public String getValueHex() {
        return value_hex;
    }

    public long getConfirmations() {
        return confirmations;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "OutputUnspent{" +
                "tx_hash='" + tx_hash + '\'' +
                ", tx_hash_big_endian='" + tx_hash_big_endian + '\'' +
                ", tx_index=" + tx_index +
                ", tx_output_n=" + tx_output_n +
                ", script='" + script + '\'' +
                ", value=" + value +
                ", value_hex='" + value_hex + '\'' +
                ", confirmations=" + confirmations +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}