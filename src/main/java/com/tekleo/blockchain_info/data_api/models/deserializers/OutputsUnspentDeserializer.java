package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tekleo.blockchain_info.data_api.models.OutputUnspent;
import com.tekleo.blockchain_info.data_api.models.OutputsUnspent;

import java.lang.reflect.Type;

/**
 * Deserializer for {@link OutputsUnspent}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class OutputsUnspentDeserializer implements JsonDeserializer<OutputsUnspent> {
    @Override
    public OutputsUnspent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        OutputsUnspent unspent = new OutputsUnspent();
        for (JsonElement e : jsonElement.getAsJsonObject().get("unspent_outputs").getAsJsonArray())
            unspent.add(jsonDeserializationContext.deserialize(e, OutputUnspent.class));
        return unspent;
    }
}