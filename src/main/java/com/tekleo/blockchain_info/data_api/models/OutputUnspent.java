package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Unspent output
 *
 * Used in {@link OutputsUnspent} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class OutputUnspent implements Model, Immutable, Serializable, Cloneable {
    private String tx_hash;
    private String tx_hash_big_endian;
    private long tx_index;
    private long tx_output_n;
    private String script;
    private long value;
    private String value_hex;
    private long confirmations;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private OutputUnspent(String tx_hash, String tx_hash_big_endian, long tx_index, long tx_output_n, String script, long value, String value_hex, long confirmations) {
        this.tx_hash = tx_hash;
        this.tx_hash_big_endian = tx_hash_big_endian;
        this.tx_index = tx_index;
        this.tx_output_n = tx_output_n;
        this.script = script;
        this.value = value;
        this.value_hex = value_hex;
        this.confirmations = confirmations;
    }
    //------------------------------------------------------------------------------------------------------------------



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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutputUnspent that = (OutputUnspent) o;
        return Objects.equals(tx_hash, that.tx_hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tx_hash);
    }

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

    @Override
    public OutputUnspent clone() {
        return new OutputUnspent(tx_hash, tx_hash_big_endian, tx_index, tx_output_n, script, value, value_hex, confirmations);
    }
    //------------------------------------------------------------------------------------------------------------------
}