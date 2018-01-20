package com.tekleo.blockchain_info.data_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlockLatestTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"hash\":\"0000000000000538200a48202ca6340e983646ca088c7618ae82d68e0c76ef5a\",\n" +
                "    \"time\":1325794737,\n" +
                "    \"block_index\":841841,\n" +
                "    \"height\":160778,\n" +
                "    \"txIndexes\":[13950369,13950510,13951472]\n" +
                " }";
    }
}