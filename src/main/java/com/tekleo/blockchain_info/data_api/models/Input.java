package com.tekleo.blockchain_info.data_api.models;

public class Input {
    private OutputPrevious prev_out;
    private String script;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
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
                "prev_out=" + prev_out +
                ", script='" + script + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}