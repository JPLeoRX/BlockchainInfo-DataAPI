package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
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

        BalanceSummary balanceSummary = Parser.fromJson(json, BalanceSummary.class);
        assertEquals(0, balanceSummary.getFinalBalance());
        assertEquals(0, balanceSummary.getNumberOfTransactions());
        assertEquals(0, balanceSummary.getTotalReceived());
    }

    @Test
    public void test2() {
        String json = "{\n" +
                "        \"final_balance\": 0,\n" +
                "        \"n_tx\": 2,\n" +
                "        \"total_received\": 310630609\n" +
                "    }";

        BalanceSummary balanceSummary = Parser.fromJson(json, BalanceSummary.class);
        assertEquals(0, balanceSummary.getFinalBalance());
        assertEquals(2, balanceSummary.getNumberOfTransactions());
        assertEquals(310630609, balanceSummary.getTotalReceived());
    }
}