package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.BlockHeightDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetBlockHeight;

import java.util.ArrayList;

/**
 * Block height
 *
 * Used in {@link GetBlockHeight} request
 *
 * Deserialized by {@link BlockHeightDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class BlockHeight extends ArrayList<Block> implements Model {

}