package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceSummaryTest {
    @Test
    public void test1() {
        String json = "{\n" +
                "        \"final_balance\": 0,\n" +
                "        \"n_tx\": 0,\n" +
                "        \"total_received\": 0\n" +
                "    }";
    }

    @Test
    public void test2() {
        String json = "{\n" +
                "        \"final_balance\": 0,\n" +
                "        \"n_tx\": 2,\n" +
                "        \"total_received\": 310630609\n" +
                "    }";
    }
}