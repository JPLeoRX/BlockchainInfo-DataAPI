package com.tekleo.blockchain_info.data_api.models;

public class BalanceSummary {
    private long final_balance;
    private long n_tx;
    private long total_received;

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
    public String toString() {
        return "BalanceSummary{" +
                "final_balance=" + final_balance +
                ", n_tx=" + n_tx +
                ", total_received=" + total_received +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}