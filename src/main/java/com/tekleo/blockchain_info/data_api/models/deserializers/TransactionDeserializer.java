package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.Input;
import com.tekleo.blockchain_info.data_api.models.Output;
import com.tekleo.blockchain_info.data_api.models.Transaction;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Deserializer for {@link Transaction}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class TransactionDeserializer implements JsonDeserializer<Transaction> {
    @Override
    public Transaction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read all basic data
        String hash = rootObject.get("hash").getAsString();
        long ver = rootObject.get("ver").getAsLong();
        long vin_sz = rootObject.get("vin_sz").getAsLong();
        long vout_sz = rootObject.get("vout_sz").getAsLong();
        String lock_time = rootObject.get("lock_time").getAsString();
        long size = rootObject.get("size").getAsLong();
        String relayed_by = rootObject.get("relayed_by").getAsString();
        String tx_index = rootObject.get("tx_index").getAsString();

        // Read array of inputs
        ArrayList<Input> inputs = new ArrayList<>();
        for (JsonElement e : rootObject.get("inputs").getAsJsonArray())
            inputs.add(jsonDeserializationContext.deserialize(e, Input.class));

        // Read array of outputs
        ArrayList<Output> out = new ArrayList<>();
        for (JsonElement e : rootObject.get("out").getAsJsonArray())
            out.add(jsonDeserializationContext.deserialize(e, Output.class));

        // Return resulting object
        return new Transaction(hash, ver, vin_sz, vout_sz, lock_time, size, relayed_by, tx_index, inputs, out);
    }
}