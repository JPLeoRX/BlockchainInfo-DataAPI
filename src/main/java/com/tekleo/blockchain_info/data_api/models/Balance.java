package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.BalanceDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetBalance;

import java.util.HashMap;

/**
 * Balance
 *
 * Used in {@link GetBalance} request
 *
 * Deserialized by {@link BalanceDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class Balance extends HashMap<String, BalanceSummary> implements Model {

}