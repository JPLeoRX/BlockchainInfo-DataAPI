package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
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
        TransactionsUnconfirmed txs = new TransactionsUnconfirmed();
        for (JsonElement e : jsonElement.getAsJsonObject().get("txs").getAsJsonArray())
            txs.add(jsonDeserializationContext.deserialize(e, Transaction.class));
        return txs;
    }
}