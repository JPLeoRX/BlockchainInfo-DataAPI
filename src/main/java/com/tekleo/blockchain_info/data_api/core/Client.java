package com.tekleo.blockchain_info.data_api.core;

import com.tekleo.blockchain_info.data_api.core.Request;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

public class Client {
    private Request.Type type;
    private String url;

    private BasicHeader jsonHeader;
    private HttpClient client;
    private HttpUriRequest request;
    private HttpResponse response;
    private HttpEntity entity;
    private String jsonResponse;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Client(Request.Type type, String url) {
        this.type = type;
        this.url = url;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Build the request
    //------------------------------------------------------------------------------------------------------------------
    private void createHeaders() {
        jsonHeader = new BasicHeader(HttpHeaders.ACCEPT, "application/json");
    }

    private void createClient() {
        client = HttpClients.custom().build();
    }

    private void createGetRequest() {
        request = RequestBuilder.get().setUri(url).setHeader(jsonHeader).build();
    }

    private void createPostRequest() {
        throw new NotImplementedException();
    }

    private void createPutRequest() {
        throw new NotImplementedException();
    }

    private void createRequest() {
        if (type == Request.Type.GET)
            createGetRequest();
        else
            throw new IllegalArgumentException("Other types are not supported in this api");
    }
    //------------------------------------------------------------------------------------------------------------------



    // Execute the request
    //------------------------------------------------------------------------------------------------------------------
    private void executeRequest() {
        try {
            response = client.execute(request);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void extractEntity() {
        entity = response.getEntity();
    }

    private void extractJson() {
        try {
            jsonResponse = EntityUtils.toString(entity);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
    //------------------------------------------------------------------------------------------------------------------



    // Public methods
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Build and execute the request, returning JSON response
     * @return json response
     */
    public String send() {
        createHeaders();
        createClient();
        createRequest();
        executeRequest();
        extractEntity();
        extractJson();
        return jsonResponse;
    }
    //------------------------------------------------------------------------------------------------------------------
}