package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK\": {\n" +
                "        \"final_balance\": 0,\n" +
                "        \"n_tx\": 0,\n" +
                "        \"total_received\": 0\n" +
                "    },\n" +
                "    \"15EW3AMRm2yP6LEF5YKKLYwvphy3DmMqN6\": {\n" +
                "        \"final_balance\": 0,\n" +
                "        \"n_tx\": 2,\n" +
                "        \"total_received\": 310630609\n" +
                "    }\n" +
                "}";
    }
}