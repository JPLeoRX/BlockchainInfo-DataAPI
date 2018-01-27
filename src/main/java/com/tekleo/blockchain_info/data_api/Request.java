package com.tekleo.blockchain_info.data_api;

import com.tekleo.blockchain_info.data_api.helpers.StringUtils;
import com.tekleo.blockchain_info.data_api.utils.Client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public interface Request {
    public static final String deliminator = "|";

    public abstract Type getType();

    public abstract String getMethod();

    public abstract List<String> getArguments();

    public abstract Map<String, String> getParameters();

    default String getUrl() {
        // Get base url
        String url = Endpoints.getUrl(getMethod());

        // If there are any arguments
        if (getArguments() != null && !getArguments().isEmpty())
            url += "/" + StringUtils.join(getArguments(), deliminator);

        // If there are any parameters and it's a get request
        if (getParameters() != null && !getParameters().isEmpty() && getType() == Type.GET) {
            url += "?";
            for (Map.Entry<String, String> parameter : getParameters().entrySet())
                url += parameter.getKey() + "=" + parameter.getValue() + "&";
            url = url.substring(0, url.length() - 1);
        }

        return url;
    }

    default String send() {
        return new Client(getUrl()).send();
    }

    public static enum Type {
        GET, POST, PUT;
    }
}