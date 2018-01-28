package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.TransactionsUnconfirmed;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

public class GetUnconfirmedTransactionsTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetUnconfirmedTransactions();
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        TransactionsUnconfirmed transactionsUnconfirmed = Parser.fromJson(json, TransactionsUnconfirmed.class);
    }
}