package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressSummaryTest {
    @Test
    public void test1() {
        String json = "{\n" +
                "        \"hash160\":\"641ad5051edd97029a003fe9efb29359fcee409d\",\n" +
                "        \"address\":\"1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq\",\n" +
                "        \"n_tx\":4,\n" +
                "        \"total_received\":1401000000,\n" +
                "        \"total_sent\":1000000,\n" +
                "        \"final_balance\":1400000000\n" +
                "    }";
    }

    @Test
    public void test2() {
        String json = "{\n" +
                "        \"hash160\":\"ddbeb8b1a5d54975ee5779cf64573081a89710e5\",\n" +
                "        \"address\":\"1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK\",\n" +
                "        \"n_tx\":0,\n" +
                "        \"total_received\":0,\n" +
                "        \"total_sent\":0,\n" +
                "        \"final_balance\":0\n" +
                "    }";
    }
}