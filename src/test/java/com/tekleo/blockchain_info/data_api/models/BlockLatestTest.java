package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
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

        BlockLatest blockLatest = Parser.fromJson(json, BlockLatest.class);
        assertEquals("0000000000000538200a48202ca6340e983646ca088c7618ae82d68e0c76ef5a", blockLatest.getHash());
        assertEquals(1325794737, blockLatest.getTime());
        assertEquals(841841, blockLatest.getBlockIndex());
        assertEquals(160778, blockLatest.getHeight());
        assertEquals(3, blockLatest.getTransactionsIndexes().size());
        assertEquals(13950369, blockLatest.getTransactionsIndexes().get(0).longValue());
        assertEquals(13950510, blockLatest.getTransactionsIndexes().get(1).longValue());
        assertEquals(13951472, blockLatest.getTransactionsIndexes().get(2).longValue());
    }
}