package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class OutputTest {
    @Test
    public void test1() {
        String json = "{\n" +
                "                    \"value\":\"98000000\",\n" +
                "                    \"hash\":\"29d6a3540acfa0a950bef2bfdc75cd51c24390fd\",\n" +
                "                    \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\"\n" +
                "                }";
    }

    @Test
    public void test2() {
        String json = "{\n" +
                "                    \"value\":\"2000000\",\n" +
                "                    \"hash\":\"17b5038a413f5c5ee288caa64cfab35a0c01914e\",\n" +
                "                    \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\"\n" +
                "                }\n";
    }
}