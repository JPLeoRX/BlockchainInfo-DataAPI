package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;

/**
 * Output
 *
 * Used in {@link Transaction} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class Output implements Model, Immutable, Serializable, Cloneable {
    private boolean spent;
    private long tx_index;
    private long type;
    private String addr;
    private long value;
    private long n;
    private String script;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private Output(boolean spent, long tx_index, long type, String addr, long value, long n, String script) {
        this.spent = spent;
        this.tx_index = tx_index;
        this.type = type;
        this.addr = addr;
        this.value = value;
        this.n = n;
        this.script = script;
    }
    //------------------------------------------------------------------------------------------------------------------



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

    @Override
    public Output clone() {
        return new Output(spent, tx_index, type, addr, value, n, script);
    }
    //------------------------------------------------------------------------------------------------------------------
}