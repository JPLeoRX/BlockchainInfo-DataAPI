package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Chart vertex
 *
 * Used in {@link ChartData} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class ChartVertex implements Model, Immutable, Serializable, Cloneable {
    private long x;
    private double y;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private ChartVertex(long x, double y) {
        this.x = x;
        this.y = y;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public long getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChartVertex that = (ChartVertex) o;
        return x == that.x && Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "ChartVertex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public ChartVertex clone() {
        return new ChartVertex(x, y);
    }
    //------------------------------------------------------------------------------------------------------------------
}