package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

public class ChartData {
    private String status;
    private String name;
    private String unit;
    private String period;
    private String description;
    private ArrayList<ChartVertex> values;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public ChartData(String status, String name, String unit, String period, String description, ArrayList<ChartVertex> values) {
        this.status = status;
        this.name = name;
        this.unit = unit;
        this.period = period;
        this.description = description;
        this.values = values;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getPeriod() {
        return period;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<ChartVertex> getValues() {
        return values;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "ChartData{" +
                "status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", period='" + period + '\'' +
                ", description='" + description + '\'' +
                ", values=" + values +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------

}