package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
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

        Balance balance = Parser.fromJson(json, Balance.class);

        BalanceSummary balanceSummary1 = balance.get("1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK");
        assertEquals(0, balanceSummary1.getFinalBalance());
        assertEquals(0, balanceSummary1.getNumberOfTransactions());
        assertEquals(0, balanceSummary1.getTotalReceived());

        BalanceSummary balanceSummary2 = balance.get("15EW3AMRm2yP6LEF5YKKLYwvphy3DmMqN6");
        assertEquals(0, balanceSummary2.getFinalBalance());
        assertEquals(2, balanceSummary2.getNumberOfTransactions());
        assertEquals(310630609, balanceSummary2.getTotalReceived());
    }
}