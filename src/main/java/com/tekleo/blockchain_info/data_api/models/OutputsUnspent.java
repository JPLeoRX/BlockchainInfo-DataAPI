package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.OutputsUnspentDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetUnspentOutputs;

import java.util.ArrayList;

/**
 * Unspent outputs
 *
 * Used in {@link GetUnspentOutputs} request
 *
 * Deserialized by {@link OutputsUnspentDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class OutputsUnspent extends ArrayList<OutputUnspent> implements Model {

}