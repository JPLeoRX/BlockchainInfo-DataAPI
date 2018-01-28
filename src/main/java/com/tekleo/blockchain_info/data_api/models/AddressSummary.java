package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Summary of an address
 *
 * Used in {@link AddressMultiple} model
 *
 * Deserialized automatically
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class AddressSummary implements Model, Immutable, Serializable, Cloneable {
    private String address;
    private long n_tx;
    private long total_received;
    private long total_sent;
    private long final_balance;
    private long change_index;
    private long account_index;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    private AddressSummary(String address, long n_tx, long total_received, long total_sent, long final_balance, long change_index, long account_index) {
        this.address = address;
        this.n_tx = n_tx;
        this.total_received = total_received;
        this.total_sent = total_sent;
        this.final_balance = final_balance;
        this.change_index = change_index;
        this.account_index = account_index;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getAddress() {
        return address;
    }

    public long getNumberOfTransactions() {
        return n_tx;
    }

    public long getTotalReceived() {
        return total_received;
    }

    public long getTotalSent() {
        return total_sent;
    }

    public long getFinalBalance() {
        return final_balance;
    }

    public long getChangeIndex() {
        return change_index;
    }

    public long getAccountIndex() {
        return account_index;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressSummary that = (AddressSummary) o;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "AddressSummary{" +
                "address='" + address + '\'' +
                ", n_tx=" + n_tx +
                ", total_received=" + total_received +
                ", total_sent=" + total_sent +
                ", final_balance=" + final_balance +
                ", change_index=" + change_index +
                ", account_index=" + account_index +
                '}';
    }

    @Override
    public AddressSummary clone() {
        return new AddressSummary(address, n_tx, total_received, total_sent, final_balance, change_index, account_index);
    }
    //------------------------------------------------------------------------------------------------------------------
}