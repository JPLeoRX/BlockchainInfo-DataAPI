package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;

/**
 * Input
 *
 * Used in {@link Transaction} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class Input implements Model, Immutable, Serializable, Cloneable {
    private long sequence;
    private String witness;
    private OutputPrevious prev_out;
    private String script;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private Input(long sequence, String witness, OutputPrevious prev_out, String script) {
        this.sequence = sequence;
        this.witness = witness;
        this.prev_out = prev_out;
        this.script = script;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public long getSequence() {
        return sequence;
    }

    public String getWitness() {
        return witness;
    }

    public OutputPrevious getPreviousOutput() {
        return prev_out;
    }

    public String getScript() {
        return script;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Input{" +
                "sequence=" + sequence +
                ", witness='" + witness + '\'' +
                ", prev_out=" + prev_out +
                ", script='" + script + '\'' +
                '}';
    }

    @Override
    public Input clone() {
        return new Input(sequence, witness, prev_out, script);
    }
    //------------------------------------------------------------------------------------------------------------------
}