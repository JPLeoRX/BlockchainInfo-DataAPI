package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.Model;
import com.tekleo.blockchain_info.data_api.requests.GetMultiAddress;

import java.util.ArrayList;

/**
 * Multiple addresses
 *
 * Used in {@link GetMultiAddress} request
 *
 * @author Leo Ertuna
 * @since 21.01.2018 01:18
 */
public class AddressMultiple implements Model {
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