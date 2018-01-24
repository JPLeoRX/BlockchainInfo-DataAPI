package com.tekleo.blockchain_info.data_api.models.deserializers;

import com.google.gson.*;
import com.tekleo.blockchain_info.data_api.models.BlockSummary;
import com.tekleo.blockchain_info.data_api.models.Blocks;
import com.tekleo.blockchain_info.data_api.models.ChartData;
import com.tekleo.blockchain_info.data_api.models.ChartVertex;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Deserializer for {@link ChartData}
 *
 * @since 21.01.2018
 * @author Leo Ertuna
 */
public class ChartDataDeserializer implements JsonDeserializer<ChartData> {
    @Override
    public ChartData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        // Store root object
        JsonObject rootObject = jsonElement.getAsJsonObject();

        // Read all basic data
        String status = rootObject.get("status").getAsString();
        String name = rootObject.get("name").getAsString();
        String unit = rootObject.get("unit").getAsString();
        String period = rootObject.get("period").getAsString();
        String description = rootObject.get("description").getAsString();

        // Read array of values
        ArrayList<ChartVertex> values = new ArrayList<>();
        for (JsonElement e : jsonElement.getAsJsonObject().get("values").getAsJsonArray())
            values.add(jsonDeserializationContext.deserialize(e, ChartVertex.class));

        return new ChartData(status, name, unit, period, description, values);
    }
}