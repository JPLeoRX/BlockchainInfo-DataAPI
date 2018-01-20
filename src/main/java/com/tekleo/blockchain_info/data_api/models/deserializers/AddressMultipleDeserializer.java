package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.AddressMultiple;
import com.tekleo.blockchain_info.data_api.models.AddressSummary;
import com.tekleo.blockchain_info.data_api.models.Transaction;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Deserializer for {@link AddressMultiple}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class AddressMultipleDeserializer implements JsonDeserializer<AddressMultiple> {
    @Override
    public AddressMultiple deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read array of addresses
        ArrayList<AddressSummary> addresses = new ArrayList<>();
        for (JsonElement e : rootObject.get("addresses").getAsJsonArray())
            addresses.add(jsonDeserializationContext.deserialize(e, AddressSummary.class));

        // Read array of transactions
        ArrayList<Transaction> txs = new ArrayList<>();
        for (JsonElement e : rootObject.get("txs").getAsJsonArray())
            txs.add(jsonDeserializationContext.deserialize(e, Transaction.class));

        // Return resulting object
        return new AddressMultiple(addresses, txs);
    }
}