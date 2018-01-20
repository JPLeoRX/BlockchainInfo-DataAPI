package com.tekleo.blockchain_info.data_api.models;

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
                "    \"block_height, 12200,\n" +
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
    }
}