package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

public class Address {
    private String hash160;
    private String address;
    private long n_tx;
    private long n_unredeemed;
    private long total_received;
    private long total_sent;
    private long final_balance;
    private ArrayList<Transaction> txs;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Address(String hash160, String address, long n_tx, long n_unredeemed, long total_received, long total_sent, long final_balance, ArrayList<Transaction> txs) {
        this.hash160 = hash160;
        this.address = address;
        this.n_tx = n_tx;
        this.n_unredeemed = n_unredeemed;
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

    public long getNumberOfUnredeemed() {
        return n_unredeemed;
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
    public String toString() {
        return "Address{" +
                "hash160='" + hash160 + '\'' +
                ", address='" + address + '\'' +
                ", n_tx=" + n_tx +
                ", n_unredeemed=" + n_unredeemed +
                ", total_received=" + total_received +
                ", total_sent=" + total_sent +
                ", final_balance=" + final_balance +
                ", txs=" + txs +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}