package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.Request;
import com.tekleo.blockchain_info.data_api.models.Balance;
import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetBalanceTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetBalance("1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY", "1GX28yLjVWux7ws4UQ9FB4MnLH4UKTPK2z");
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();
        System.out.println(json);

        // Form the Model object
        Balance addressMultiple = Parser.fromJson(json, Balance.class);
        System.out.println(addressMultiple);
    }
}