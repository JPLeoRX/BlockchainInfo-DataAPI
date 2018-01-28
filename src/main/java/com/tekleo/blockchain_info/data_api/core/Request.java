package com.tekleo.blockchain_info.data_api.core;

import com.tekleo.blockchain_info.data_api.utils.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * This interface identifies that an object acts as a Request in this REST client
 *
 * @author Leo Ertuna
 * @since 20.01.2018 02:23
 */
public interface Request {
    public static final String argumentsDeliminator = "|";
    public static final String parametersDeliminator = "&";

    /**
     * @return type of this request
     */
    public abstract Type getType();

    /**
     * @return base of this request like "www.example.com/api" in REST request to "www.example.com/api/list_users"
     */
    public abstract String getBase();

    /**
     * @return method of this request like "/list_users" in REST request to "www.example.com/api/list_users"
     */
    public abstract String getMethod();

    /**
     * @return method of this request like "female" in REST request to "www.example.com/api/list_users/female"
     */
    public abstract List<String> getArguments();

    /**
     * @return parameters of this request like "a=1&b=2" in REST request to "www.example.com/api/ask?a=1&b=2"
     */
    public abstract Map<String, String> getParameters();

    /**
     * Form the url from all the arguments and parameters
     * @return url
     */
    default String getUrl() {
        // Get base url
        String url = getBase() + getMethod();

        // If there are any arguments
        if (getArguments() != null && !getArguments().isEmpty())
            url += "/" + StringUtils.join(getArguments(), argumentsDeliminator);

        // If there are any parameters and it's a get request
        if (getParameters() != null && !getParameters().isEmpty() && getType() == Type.GET)
            url += "?" + StringUtils.join(getParameters(), "=", parametersDeliminator);

        // Return resulting url
        return url;
    }

    /**
     * Send the request via the {@link Client} and return the JSON response
     * @return json respons
     */
    default String send() {
        Client client = new Client(getType(), getUrl());
        String json = client.send();
        return json;
    }

    /**
     * Enum for request type
     * Get, post, put
     */
    public static enum Type {
        GET, POST, PUT;
    }
}