package com.tekleo.blockchain_info.data_api.models;

public class Output {
    private String value;
    private String hash;
    private String script;

    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getValue() {
        return value;
    }

    public String getHash() {
        return hash;
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
                "value='" + value + '\'' +
                ", hash='" + hash + '\'' +
                ", script='" + script + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}