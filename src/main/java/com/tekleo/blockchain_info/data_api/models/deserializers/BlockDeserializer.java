package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.Block;
import com.tekleo.blockchain_info.data_api.models.Transaction;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Deserializer for {@link Block}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class BlockDeserializer implements JsonDeserializer<Block> {
    @Override
    public Block deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read all basic data
        String hash = rootObject.get("hash").getAsString();
        long ver = rootObject.get("ver").getAsLong();
        String prev_block = rootObject.get("prev_block").getAsString();
        String mrkl_root = rootObject.get("mrkl_root").getAsString();
        long time = rootObject.get("time").getAsLong();
        long bits = rootObject.get("bits").getAsLong();
        long fee = rootObject.get("fee").getAsLong();
        long nonce = rootObject.get("nonce").getAsLong();
        long n_tx = rootObject.get("n_tx").getAsLong();
        long size = rootObject.get("size").getAsLong();
        long block_index = rootObject.get("block_index").getAsLong();
        boolean main_chain = rootObject.get("main_chain").getAsBoolean();
        long height = rootObject.get("height").getAsLong();
        long received_time = rootObject.get("received_time").getAsLong();
        String relayed_by = rootObject.get("relayed_by").getAsString();

        // Read array of transactions
        ArrayList<Transaction> txs = new ArrayList<>();
        for (JsonElement e : rootObject.get("tx").getAsJsonArray())
            txs.add(jsonDeserializationContext.deserialize(e, Transaction.class));

        // Return resulting object
        return new Block(hash, ver, prev_block, mrkl_root, time, bits, fee, nonce, n_tx, size, block_index, main_chain, height, received_time, relayed_by, txs);
    }
}