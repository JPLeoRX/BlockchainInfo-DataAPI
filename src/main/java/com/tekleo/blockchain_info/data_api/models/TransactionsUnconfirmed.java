package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.TransactionsUnconfirmedDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetUnconfirmedTransactions;

import java.util.ArrayList;

/**
 * Unconfirmed transactions
 *
 * Used in {@link GetUnconfirmedTransactions} request
 *
 * Deserialized by {@link TransactionsUnconfirmedDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class TransactionsUnconfirmed extends ArrayList<Transaction> implements Model {

}