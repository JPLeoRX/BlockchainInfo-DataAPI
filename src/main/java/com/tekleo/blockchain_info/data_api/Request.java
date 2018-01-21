package com.tekleo.blockchain_info.data_api;

import java.util.List;
import java.util.Map;

public interface Request {
    public abstract Type getType();

    public abstract String getMethod();

    public abstract List<String> getArguments();

    public abstract Map<String, String> getParameters();

    public static enum Type {
        GET, POST, PUT;
    }
}