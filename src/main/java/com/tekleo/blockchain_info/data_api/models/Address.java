package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Immutable;
import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.AddressDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetSingleAddress;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Address
 *
 * Used in {@link GetSingleAddress} request
 *
 * Deserialized by {@link AddressDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class Address implements Model, Immutable, Serializable, Cloneable {
    private String hash160;
    private String address;
    private long n_tx;
    private long total_received;
    private long total_sent;
    private long final_balance;
    private ArrayList<Transaction> txs;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Address(String hash160, String address, long n_tx, long total_received, long total_sent, long final_balance, ArrayList<Transaction> txs) {
        this.hash160 = hash160;
        this.address = address;
        this.n_tx = n_tx;
        this.total_received = total_received;
        this.total_sent = total_sent;
        this.final_balance = final_balance;
        this.txs = txs;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getHash160() {
        return hash160;
    }

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

    public ArrayList<Transaction> getTransactions() {
        return txs;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "Address{" +
                "hash160='" + hash160 + '\'' +
                ", address='" + address + '\'' +
                ", n_tx=" + n_tx +
                ", total_received=" + total_received +
                ", total_sent=" + total_sent +
                ", final_balance=" + final_balance +
                ", txs=" + txs +
                '}';
    }

    @Override
    public Address clone() {
        return new Address(hash160, address, n_tx, total_received, total_sent, final_balance, txs);
    }
    //------------------------------------------------------------------------------------------------------------------
}