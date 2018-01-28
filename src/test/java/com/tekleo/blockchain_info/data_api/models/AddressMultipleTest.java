package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressMultipleTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"addresses\":[\n" +
                "\n" +
                "    {\n" +
                "        \"hash160\":\"641ad5051edd97029a003fe9efb29359fcee409d\",\n" +
                "        \"address\":\"1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq\",\n" +
                "        \"n_tx\":4,\n" +
                "        \"total_received\":1401000000,\n" +
                "        \"total_sent\":1000000,\n" +
                "        \"final_balance\":1400000000\n" +
                "    },\n" +
                "\n" +
                "    {\n" +
                "        \"hash160\":\"ddbeb8b1a5d54975ee5779cf64573081a89710e5\",\n" +
                "        \"address\":\"1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK\",\n" +
                "        \"n_tx\":0,\n" +
                "        \"total_received\":0,\n" +
                "        \"total_sent\":0,\n" +
                "        \"final_balance\":0\n" +
                "    }],\n" +
                "\n" +
                "    \"txs\":[]\n" +
                "}";

        AddressMultiple addressMultiple = Parser.fromJson(json, AddressMultiple.class);
        assertEquals(2, addressMultiple.getAddresses().size());
        assertEquals(0, addressMultiple.getTransactions().size());

        AddressSummary addressSummary1 = addressMultiple.getAddresses().get(0);
        //assertEquals("641ad5051edd97029a003fe9efb29359fcee409d", addressSummary1.getHash160());
        assertEquals("1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq", addressSummary1.getAddress());
        assertEquals(4, addressSummary1.getNumberOfTransactions());
        assertEquals(1401000000, addressSummary1.getTotalReceived());
        assertEquals(1000000, addressSummary1.getTotalSent());
        assertEquals(1400000000, addressSummary1.getFinalBalance());

        AddressSummary addressSummary2 = addressMultiple.getAddresses().get(1);
        //assertEquals("ddbeb8b1a5d54975ee5779cf64573081a89710e5", addressSummary2.getHash160());
        assertEquals("1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK", addressSummary2.getAddress());
        assertEquals(0, addressSummary2.getNumberOfTransactions());
        assertEquals(0, addressSummary2.getTotalReceived());
        assertEquals(0, addressSummary2.getTotalSent());
        assertEquals(0, addressSummary2.getFinalBalance());
    }
}