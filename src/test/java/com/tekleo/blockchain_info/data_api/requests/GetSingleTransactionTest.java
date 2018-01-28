package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.Input;
import com.tekleo.blockchain_info.data_api.models.Output;
import com.tekleo.blockchain_info.data_api.models.OutputPrevious;
import com.tekleo.blockchain_info.data_api.models.Transaction;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSingleTransactionTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetSingleTransaction("67e438f5e862e03bb4aa06b6e45a5bdd62c9eee9917d646a32b39f9ccf123db1");
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        Transaction t = Parser.fromJson(json, Transaction.class);

        // Test basic data fields
        assertEquals(2, t.getVersion());
        assertEquals(892, t.getWeight());
        assertEquals(505255, t.getBlockHeight());
        assertEquals("0.0.0.0", t.getRelayedBy());
        assertEquals(0, t.getLockTime());
        assertEquals(223, t.getSize());
        assertEquals(false, t.isDoubleSpend());
        assertEquals(1516493833, t.getTime());
        assertEquals(325734608, t.getTransactionIndex());
        assertEquals(1, t.getVolumeInputSize());
        assertEquals("67e438f5e862e03bb4aa06b6e45a5bdd62c9eee9917d646a32b39f9ccf123db1", t.getHash());
        assertEquals(2, t.getVolumeOutputSize());

        Input input = t.getInputs().get(0);
        assertEquals(4294967295L, input.getSequence());
        assertEquals("", input.getWitness());
        assertEquals("47304402204c2e02afe0a6cf6dcc05ab11af7589f38ace7eb32a8c24a9a46152e1c50579a00220512d8995484c67f50016f266d13cd43d97ab374583a655ea014344f0b9e62bef0121034e9c5f62850164c5c54578754b34aeba3ac1779d01b7deb99903a911d7a128ef", input.getScript());

        OutputPrevious previousOutput = input.getPreviousOutput();
        assertEquals(true, previousOutput.isSpent());
        assertEquals(325690651, previousOutput.getTransactionIndex());
        assertEquals(0, previousOutput.getType());
        assertEquals("1HA6vtWYYSaxWFe62rZcTiGrA912pW2StE", previousOutput.getAddress());
        assertEquals(746843446, previousOutput.getValue());
        assertEquals(1, previousOutput.getN());
        assertEquals("76a914b13ab49fdad017495b56d0571dda000a6e356ef788ac", previousOutput.getScript());

        Output output1 = t.getOutputs().get(0);
        assertEquals(false, output1.isSpent());
        assertEquals(325734608, output1.getTransactionIndex());
        assertEquals(0, output1.getType());
        assertEquals("3CWRcG2wgC6mgNjSHQwfzVDCjkznXaGEpm", output1.getAddress());
        assertEquals(844466, output1.getValue());
        assertEquals(0, output1.getN());
        assertEquals("a91476a8943f02ab99b05ecbf1f0cb46c070e81e4b1687", output1.getScript());

        Output output2 = t.getOutputs().get(1);
        assertEquals(true, output2.isSpent());
        assertEquals(325734608, output2.getTransactionIndex());
        assertEquals(0, output2.getType());
        assertEquals("1KXG4u6VH9tjLZmVEKZhACBZojwMQ7Zu6e", output2.getAddress());
        assertEquals(745771980, output2.getValue());
        assertEquals(1, output2.getN());
        assertEquals("76a914cb2b52080b0d459b5a887db64e0f8bbe6dea5b0988ac", output2.getScript());
    }
}