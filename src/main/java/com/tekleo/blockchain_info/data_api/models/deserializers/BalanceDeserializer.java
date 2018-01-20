package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tekleo.blockchain_info.data_api.models.Balance;
import com.tekleo.blockchain_info.data_api.models.BalanceSummary;

import java.lang.reflect.Type;
import java.util.Map;

public class BalanceDeserializer implements JsonDeserializer<Balance> {
    @Override
    public Balance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Balance balance = new Balance();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet())
            balance.put(entry.getKey(), jsonDeserializationContext.deserialize(entry.getValue(), BalanceSummary.class));
        return balance;
    }
}