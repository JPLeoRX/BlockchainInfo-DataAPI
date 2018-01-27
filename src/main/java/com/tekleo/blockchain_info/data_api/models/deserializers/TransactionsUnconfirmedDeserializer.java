package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.Transaction;
import com.tekleo.blockchain_info.data_api.models.TransactionsUnconfirmed;

import java.lang.reflect.Type;

/**
 * Deserializer for {@link TransactionsUnconfirmed}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class TransactionsUnconfirmedDeserializer implements JsonDeserializer<TransactionsUnconfirmed> {
    @Override
    public TransactionsUnconfirmed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read array of transactions
        TransactionsUnconfirmed transactions = new TransactionsUnconfirmed();
        for (JsonElement e : rootObject.get("txs").getAsJsonArray())
            transactions.add(jsonDeserializationContext.deserialize(e, Transaction.class));
        return transactions;
    }
}