package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;

/**
 * Previous output
 *
 * Used in {@link Input} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class OutputPrevious implements Model, Immutable, Serializable, Cloneable {
    private boolean spent;
    private long type;
    private String addr;
    private long value;
    private long tx_index;
    private long n;
    private String script;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private OutputPrevious(boolean spent, long type, String addr, long value, long tx_index, long n, String script) {
        this.spent = spent;
        this.type = type;
        this.addr = addr;
        this.value = value;
        this.tx_index = tx_index;
        this.n = n;
        this.script = script;
    }
    //------------------------------------------------------------------------------------------------------------------



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

    @Override
    public OutputPrevious clone() {
        return new OutputPrevious(spent, type, addr, value, tx_index, n, script);
    }
    //------------------------------------------------------------------------------------------------------------------
}