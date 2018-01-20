package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputTest {
    @Test
    public void test() {
        String json = "{\n" +
                "                \"prev_out\":{\n" +
                "                    \"hash\":\"a3e2bcc9a5f776112497a32b05f4b9e5b2405ed9\",\n" +
                "                    \"value\":\"100000000\",\n" +
                "                    \"tx_index\":\"12554260\",\n" +
                "                    \"n\":\"2\"\n" +
                "                },\n" +
                "                \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\"\n" +
                "            }";
    }
}