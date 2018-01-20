package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.tekleo.blockchain_info.data_api.models.BlockSummary;
import com.tekleo.blockchain_info.data_api.models.Blocks;
import com.tekleo.blockchain_info.data_api.models.ChartData;
import com.tekleo.blockchain_info.data_api.models.ChartVertex;

import java.lang.reflect.Type;

/**
 * Deserializer for {@link ChartData}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class ChartDataDeserializer implements JsonDeserializer<ChartData> {
    @Override
    public ChartData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ChartData chartData = new ChartData();
        for (JsonElement e : jsonElement.getAsJsonObject().get("values").getAsJsonArray())
            chartData.add(jsonDeserializationContext.deserialize(e, ChartVertex.class));
        return chartData;
    }
}