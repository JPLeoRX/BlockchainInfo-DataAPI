package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.AddressMultiple;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

public class GetMultiAddressTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetMultiAddress("1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY", "1GX28yLjVWux7ws4UQ9FB4MnLH4UKTPK2z");
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();
        System.out.println(json);

        // Form the Model object
        AddressMultiple addressMultiple = Parser.fromJson(json, AddressMultiple.class);
        System.out.println(addressMultiple);

        // Test basic data fields
    }

}