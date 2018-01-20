package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tekleo.blockchain_info.data_api.models.BlockSummary;
import com.tekleo.blockchain_info.data_api.models.Blocks;

import java.lang.reflect.Type;

/**
 * Deserializer for {@link Blocks}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class BlocksDeserializer implements JsonDeserializer<Blocks> {
    @Override
    public Blocks deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Blocks blocks = new Blocks();
        for (JsonElement e : jsonElement.getAsJsonObject().get("blocks").getAsJsonArray())
            blocks.add(jsonDeserializationContext.deserialize(e, BlockSummary.class));
        return blocks;
    }
}