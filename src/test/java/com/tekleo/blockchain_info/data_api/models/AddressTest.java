package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"hash160\":\"660d4ef3a743e3e696ad990364e555c271ad504b\",\n" +
                "    \"address\":\"1AJbsFZ64EpEfS5UAjAfcUG8pH8Jn3rn1F\",\n" +
                "    \"n_tx\":17,\n" +
                "    \"n_unredeemed\":2,\n" +
                "    \"total_received\":1031350000,\n" +
                "    \"total_sent\":931250000,\n" +
                "    \"final_balance\":100100000,\n" +
                "    \"txs\":[]\n" +
                "}";

        Address address = Parser.fromJson(json, Address.class);
        assertEquals("660d4ef3a743e3e696ad990364e555c271ad504b", address.getHash160());
        assertEquals("1AJbsFZ64EpEfS5UAjAfcUG8pH8Jn3rn1F", address.getAddress());
        assertEquals(17, address.getNumberOfTransactions());
        //assertEquals(2, address.getNumberOfUnredeemed());
        assertEquals(1031350000, address.getTotalReceived());
        assertEquals(931250000, address.getTotalSent());
        assertEquals(100100000, address.getFinalBalance());
        assertEquals(0, address.getTransactions().size());
    }
}