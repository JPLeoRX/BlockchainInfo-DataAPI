package com.tekleo.blockchain_info.data_api.models;

public class AddressSummary {
    private String hash160;
    private String address;
    private long n_tx;
    private long total_received;
    private long total_sent;
    private long final_balance;

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
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "AddressSummary{" +
                "hash160='" + hash160 + '\'' +
                ", address='" + address + '\'' +
                ", n_tx=" + n_tx +
                ", total_received=" + total_received +
                ", total_sent=" + total_sent +
                ", final_balance=" + final_balance +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}