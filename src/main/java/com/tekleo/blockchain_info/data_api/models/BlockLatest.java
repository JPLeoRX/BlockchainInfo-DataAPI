package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.BlockLatestDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetLatestBlock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Latest Block
 *
 * Used in {@link GetLatestBlock} request
 *
 * Deserialized by {@link BlockLatestDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class BlockLatest implements Model, Immutable, Serializable, Cloneable {
    private String hash;
    private long time;
    private long block_index;
    private long height;
    private ArrayList<Long> txIndexes;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public BlockLatest(String hash, long time, long block_index, long height, ArrayList<Long> txIndexes) {
        this.hash = hash;
        this.time = time;
        this.block_index = block_index;
        this.height = height;
        this.txIndexes = txIndexes;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getHash() {
        return hash;
    }

    public long getTime() {
        return time;
    }

    public long getBlockIndex() {
        return block_index;
    }

    public long getHeight() {
        return height;
    }

    public ArrayList<Long> getTransactionsIndexes() {
        return txIndexes;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockLatest that = (BlockLatest) o;
        return Objects.equals(hash, that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        return "BlockLatest{" +
                "hash='" + hash + '\'' +
                ", time=" + time +
                ", block_index=" + block_index +
                ", height=" + height +
                ", txIndexes=" + txIndexes +
                '}';
    }

    @Override
    public BlockLatest clone() throws CloneNotSupportedException {
        return new BlockLatest(hash, time, block_index, height, txIndexes);
    }
    //------------------------------------------------------------------------------------------------------------------
}