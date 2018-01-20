package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tekleo.blockchain_info.data_api.models.Block;
import com.tekleo.blockchain_info.data_api.models.BlockHeight;

import java.lang.reflect.Type;

/**
 * Deserializer for {@link BlockHeight}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class BlockHeightDeserializer implements JsonDeserializer<BlockHeight> {
    @Override
    public BlockHeight deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        BlockHeight blockHeight = new BlockHeight();
        for (JsonElement e : jsonElement.getAsJsonObject().get("blocks").getAsJsonArray())
            blockHeight.add(jsonDeserializationContext.deserialize(e, Block.class));
        return blockHeight;
    }
}