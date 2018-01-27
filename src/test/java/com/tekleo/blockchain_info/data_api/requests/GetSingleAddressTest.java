package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.Request;
import com.tekleo.blockchain_info.data_api.models.Address;
import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSingleAddressTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetSingleAddress("1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY");
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        Address address = Parser.fromJson(json, Address.class);

        // Test basic data fields
        assertEquals("c825a1ecf2a6830c4401620c3a16f1995057c2ab", address.getHash160());
        assertEquals("1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY", address.getAddress());
        assertEquals(44935, address.getNumberOfTransactions());
        assertEquals(90622304323901L, address.getTotalReceived());
        assertEquals(90556689777486L, address.getTotalSent());
        assertEquals(65614546415L, address.getFinalBalance());
    }
}