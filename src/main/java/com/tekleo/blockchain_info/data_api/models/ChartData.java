package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.ChartDataDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetChartData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Chart data
 *
 * Used in {@link GetChartData} request
 *
 * Deserialized by {@link ChartDataDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class ChartData implements Model, Immutable, Serializable, Cloneable {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChartData chartData = (ChartData) o;
        return Objects.equals(name, chartData.name) && Objects.equals(unit, chartData.unit) && Objects.equals(period, chartData.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unit, period);
    }

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

    @Override
    public ChartData clone() {
        return new ChartData(status, name, unit, period, description, values);
    }
    //------------------------------------------------------------------------------------------------------------------
}