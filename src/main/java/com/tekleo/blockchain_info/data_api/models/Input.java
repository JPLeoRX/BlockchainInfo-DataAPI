package com.tekleo.blockchain_info.data_api.models;

public class Input {
    private long sequence;
    private String witness;
    private OutputPrevious prev_out;
    private String script;

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
    //------------------------------------------------------------------------------------------------------------------
}