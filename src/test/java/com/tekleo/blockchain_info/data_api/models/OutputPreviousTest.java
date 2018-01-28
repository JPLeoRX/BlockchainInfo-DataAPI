package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OutputPreviousTest {
    @Test
    public void test() {
        String json = "{\n" +
                "                    \"hash\":\"a3e2bcc9a5f776112497a32b05f4b9e5b2405ed9\",\n" +
                "                    \"value\":\"100000000\",\n" +
                "                    \"tx_index\":\"12554260\",\n" +
                "                    \"n\":\"2\"\n" +
                "                }";

        OutputPrevious outputPrevious = Parser.fromJson(json, OutputPrevious.class);
        //assertEquals("a3e2bcc9a5f776112497a32b05f4b9e5b2405ed9", outputPrevious.getHash());
        assertEquals("100000000", outputPrevious.getValue());
        assertEquals("12554260", outputPrevious.getTransactionIndex());
        assertEquals("2", outputPrevious.getN());
    }
}