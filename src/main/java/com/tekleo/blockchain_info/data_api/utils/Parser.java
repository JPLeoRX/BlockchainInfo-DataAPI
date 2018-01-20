package com.tekleo.blockchain_info.data_api.utils;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.tekleo.blockchain_info.data_api.models.*;
import com.tekleo.blockchain_info.data_api.models.deserializers.*;

import java.io.Reader;
import java.lang.reflect.Type;

public class Parser {
    // GsonBuilder and Gson instances
    private static GsonBuilder gsonBuilder;
    private static Gson gson;

    // Setting up custom deserializers here
    static {
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Address.class, new AddressDeserializer());
        gsonBuilder.registerTypeAdapter(AddressMultiple.class, new AddressMultipleDeserializer());
        gsonBuilder.registerTypeAdapter(Balance.class, new BalanceDeserializer());
        gsonBuilder.registerTypeAdapter(Block.class, new BlockDeserializer());
        gsonBuilder.registerTypeAdapter(BlockHeight.class, new BlockHeightDeserializer());
        gsonBuilder.registerTypeAdapter(BlockLatest.class, new BlockLatestDeserializer());
        gsonBuilder.registerTypeAdapter(Blocks.class, new BlocksDeserializer());
        gsonBuilder.registerTypeAdapter(ChartData.class, new ChartDataDeserializer());
        gsonBuilder.registerTypeAdapter(OutputsUnspent.class, new OutputsUnspentDeserializer());
        gsonBuilder.registerTypeAdapter(Transaction.class, new TransactionDeserializer());
    }

    // Create Gson from GsonBuilder
    static {
        gson = gsonBuilder.create();
    }



    // Deserialization Methods
    //------------------------------------------------------------------------------------------------------------------
    public static <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
        return gson.fromJson(json, classOfT);
    }

    public static <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
        return gson.fromJson(json, typeOfT);
    }

    public static <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException, JsonIOException {
        return gson.fromJson(json, classOfT);
    }

    public static <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
        return gson.fromJson(json, typeOfT);
    }

    public static <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException, JsonSyntaxException {
        return gson.fromJson(reader, typeOfT);
    }

    public static <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
        return gson.fromJson(json, classOfT);
    }

    public static <T> T fromJson(JsonElement json, Type typeOfT) throws JsonSyntaxException {
        return gson.fromJson(json, typeOfT);
    }
    //------------------------------------------------------------------------------------------------------------------
}