package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.Address;
import com.tekleo.blockchain_info.data_api.models.Transaction;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Deserializer for {@link Address}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class AddressDeserializer implements JsonDeserializer<Address> {
    @Override
    public Address deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read all basic data
        String hash160 = rootObject.get("hash160").getAsString();
        String address = rootObject.get("address").getAsString();
        long n_tx = rootObject.get("n_tx").getAsLong();
        long n_unredeemed = rootObject.get("n_unredeemed").getAsLong();
        long total_received = rootObject.get("total_received").getAsLong();
        long total_sent = rootObject.get("total_sent").getAsLong();
        long final_balance = rootObject.get("final_balance").getAsLong();

        // Read array of transactions
        ArrayList<Transaction> transactions = new ArrayList<>();
        for (JsonElement e : rootObject.get("txs").getAsJsonArray())
            transactions.add(jsonDeserializationContext.deserialize(e, Transaction.class));

        // Return resulting object
        return new Address(hash160, address, n_tx, n_unredeemed, total_received, total_sent, final_balance, transactions);
    }
}