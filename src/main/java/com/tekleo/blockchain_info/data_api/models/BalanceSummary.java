package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Balance summary
 *
 * Used in {@link Balance} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class BalanceSummary implements Model, Immutable, Serializable, Cloneable {
    private long final_balance;
    private long n_tx;
    private long total_received;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private BalanceSummary(long final_balance, long n_tx, long total_received) {
        this.final_balance = final_balance;
        this.n_tx = n_tx;
        this.total_received = total_received;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public long getFinalBalance() {
        return final_balance;
    }

    public long getNumberOfTransactions() {
        return n_tx;
    }

    public long getTotalReceived() {
        return total_received;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BalanceSummary that = (BalanceSummary) o;
        return final_balance == that.final_balance && n_tx == that.n_tx && total_received == that.total_received;
    }

    @Override
    public int hashCode() {
        return Objects.hash(final_balance, n_tx, total_received);
    }

    @Override
    public String toString() {
        return "BalanceSummary{" +
                "final_balance=" + final_balance +
                ", n_tx=" + n_tx +
                ", total_received=" + total_received +
                '}';
    }

    @Override
    public BalanceSummary clone() {
        return new BalanceSummary(final_balance, n_tx, total_received);
    }
    //------------------------------------------------------------------------------------------------------------------
}