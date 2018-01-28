package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Block summary
 *
 * Used in {@link Blocks} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class BlockSummary implements Model, Immutable, Serializable, Cloneable {
    private long height;
    private String hash;
    private long time;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private BlockSummary(long height, String hash, long time) {
        this.height = height;
        this.hash = hash;
        this.time = time;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public long getHeight() {
        return height;
    }

    public String getHash() {
        return hash;
    }

    public long getTime() {
        return time;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockSummary that = (BlockSummary) o;
        return Objects.equals(hash, that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        return "BlockSummary{" +
                "height=" + height +
                ", hash='" + hash + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public BlockSummary clone() {
        return new BlockSummary(height, hash, time);
    }
    //------------------------------------------------------------------------------------------------------------------
}