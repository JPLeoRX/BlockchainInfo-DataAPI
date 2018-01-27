package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.Request;
import com.tekleo.blockchain_info.data_api.models.Transaction;
import com.tekleo.blockchain_info.data_api.models.TransactionsUnconfirmed;
import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

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