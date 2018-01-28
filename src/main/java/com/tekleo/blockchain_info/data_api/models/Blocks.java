package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Model;
import com.tekleo.blockchain_info.data_api.models.deserializers.BlocksDeserializer;
import com.tekleo.blockchain_info.data_api.requests.GetBlocksForPool;
import com.tekleo.blockchain_info.data_api.requests.GetBlocksForTime;

import java.util.ArrayList;

/**
 * Blocks
 *
 * Used in {@link GetBlocksForPool} and {@link GetBlocksForTime} requests
 *
 * Deserialized by {@link BlocksDeserializer}
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:51
 */
public class Blocks extends ArrayList<BlockSummary> implements Model {

}