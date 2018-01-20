package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.BlockLatest;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Deserializer for {@link BlockLatest}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class BlockLatestDeserializer implements JsonDeserializer<BlockLatest> {
    @Override
    public BlockLatest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read all basic data
        String hash = rootObject.get("hash").getAsString();
        long time = rootObject.get("time").getAsLong();
        long block_index = rootObject.get("block_index").getAsLong();
        long height = rootObject.get("height").getAsLong();

        // Read array of transactions
        ArrayList<Long> txIndexes = new ArrayList<>();
        for (JsonElement e : rootObject.get("txIndexes").getAsJsonArray())
            txIndexes.add(e.getAsLong());

        // Return resulting object
        return new BlockLatest(hash, time, block_index, height, txIndexes);
    }
}