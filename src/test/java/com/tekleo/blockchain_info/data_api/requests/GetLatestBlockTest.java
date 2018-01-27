package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.Request;
import com.tekleo.blockchain_info.data_api.models.BlockLatest;
import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetLatestBlockTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetLatestBlock();
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        BlockLatest blockLatest = Parser.fromJson(json, BlockLatest.class);
    }
}