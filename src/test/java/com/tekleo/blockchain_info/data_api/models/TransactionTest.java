package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"hash\":\"b6f6991d03df0e2e04dafffcd6bc418aac66049e2cd74b80f14ac86db1e3f0da\",\n" +
                "    \"ver\":1,\n" +
                "    \"vin_sz\":1,\n" +
                "    \"vout_sz\":2,\n" +
                "    \"lock_time\":\"Unavailable\",\n" +
                "    \"size\":258,\n" +
                "    \"relayed_by\":\"64.179.201.80\",\n" +
                "    \"tx_index\":\"12563028\",\n" +
                "    \"inputs\":[\n" +
                "\n" +
                "\n" +
                "            {\n" +
                "                \"prev_out\":{\n" +
                "                    \"hash\":\"a3e2bcc9a5f776112497a32b05f4b9e5b2405ed9\",\n" +
                "                    \"value\":\"100000000\",\n" +
                "                    \"tx_index\":\"12554260\",\n" +
                "                    \"n\":\"2\"\n" +
                "                },\n" +
                "                \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\"\n" +
                "            }\n" +
                "\n" +
                "        ],\n" +
                "    \"out\":[\n" +
                "\n" +
                "                {\n" +
                "                    \"value\":\"98000000\",\n" +
                "                    \"hash\":\"29d6a3540acfa0a950bef2bfdc75cd51c24390fd\",\n" +
                "                    \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\"\n" +
                "                },\n" +
                "\n" +
                "                {\n" +
                "                    \"value\":\"2000000\",\n" +
                "                    \"hash\":\"17b5038a413f5c5ee288caa64cfab35a0c01914e\",\n" +
                "                    \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\"\n" +
                "                }\n" +
                "\n" +
                "        ]\n" +
                "}";

        Transaction transaction = Parser.fromJson(json, Transaction.class);
        assertEquals("b6f6991d03df0e2e04dafffcd6bc418aac66049e2cd74b80f14ac86db1e3f0da", transaction.getHash());
        assertEquals(1, transaction.getVersion());
        assertEquals(1, transaction.getVolumeInputSize());
        assertEquals(2, transaction.getVolumeOutputSize());
        assertEquals("Unavailable", transaction.getLockTime());
        assertEquals(258, transaction.getSize());
        assertEquals("64.179.201.80", transaction.getRelayedBy());
        assertEquals("12563028", transaction.getTransactionIndex());
        assertEquals(1, transaction.getInputs().size());
        assertEquals(2, transaction.getOutputs().size());

        Input input = transaction.getInputs().get(0);
        assertEquals("76a914641ad5051edd97029a003fe9efb29359fcee409d88ac", input.getScript());

        OutputPrevious outputPrevious = input.getPreviousOutput();
        //assertEquals("a3e2bcc9a5f776112497a32b05f4b9e5b2405ed9", outputPrevious.getHash());
        assertEquals("100000000", outputPrevious.getValue());
        assertEquals("12554260", outputPrevious.getTransactionIndex());
        assertEquals("2", outputPrevious.getN());

        Output output1 = transaction.getOutputs().get(0);
        assertEquals("98000000", output1.getValue());
//        assertEquals("29d6a3540acfa0a950bef2bfdc75cd51c24390fd", output1.getHash());
        assertEquals("76a914641ad5051edd97029a003fe9efb29359fcee409d88ac", output1.getScript());

        Output output2 = transaction.getOutputs().get(1);
        assertEquals("2000000", output2.getValue());
//        assertEquals("17b5038a413f5c5ee288caa64cfab35a0c01914e", output2.getHash());
        assertEquals("76a914641ad5051edd97029a003fe9efb29359fcee409d88ac", output2.getScript());
    }
}