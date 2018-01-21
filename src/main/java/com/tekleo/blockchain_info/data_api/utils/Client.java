package com.tekleo.blockchain_info.data_api.utils;

import com.tekleo.blockchain_info.data_api.Request;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

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

    public Client(String url) {
        this(Request.Type.GET, url);
    }

    protected Client(Request.Type type, String url) {
        this.type = type;
        this.url = url;
    }

    private void createHeaders() {
        jsonHeader = new BasicHeader(HttpHeaders.ACCEPT, "application/json");
    }

    private void createClient() {
        client = HttpClients.custom().build();
    }

    private void createGetRequest() {
        request = RequestBuilder.get().setUri(url).setHeader(jsonHeader).build();
    }

    private void createRequest() {
        if (type == Request.Type.GET)
            createGetRequest();
        else
            throw new IllegalArgumentException("Other types are not supported in this api");
    }

    private void executeRequest() {
        try {
            response = client.execute(request);
            entity = response.getEntity();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void extractJson() {
        try {
            jsonResponse = EntityUtils.toString(entity);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String send() {
        createHeaders();
        createClient();
        createRequest();
        executeRequest();
        extractJson();
        return jsonResponse;
    }
}