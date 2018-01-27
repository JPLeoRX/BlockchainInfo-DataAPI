package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.Model;

/**
 * Summary of an address
 *
 * Used in {@link AddressMultiple} model
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class AddressSummary implements Model {
    private String address;
    private long n_tx;
    private long total_received;
    private long total_sent;
    private long final_balance;
    private long change_index;
    private long account_index;

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
    //------------------------------------------------------------------------------------------------------------------
}