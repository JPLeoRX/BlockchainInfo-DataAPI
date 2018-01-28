package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.BlockLatest;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

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