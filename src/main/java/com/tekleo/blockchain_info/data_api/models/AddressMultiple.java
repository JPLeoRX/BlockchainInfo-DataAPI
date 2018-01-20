package com.tekleo.blockchain_info.data_api.models;

import java.util.ArrayList;

public class AddressMultiple {
    private ArrayList<AddressSummary> addresses;
    private ArrayList<Transaction> txs;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public AddressMultiple(ArrayList<AddressSummary> addresses, ArrayList<Transaction> txs) {
        this.addresses = addresses;
        this.txs = txs;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public ArrayList<AddressSummary> getAddresses() {
        return addresses;
    }

    public ArrayList<Transaction> getTransactions() {
        return txs;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Others
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "AddressMultiple{" +
                "addresses=" + addresses +
                ", txs=" + txs +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}