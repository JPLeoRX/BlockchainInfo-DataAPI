package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"hash\":\"0000000000000bae09a7a393a8acded75aa67e46cb81f7acaa5ad94f9eacd103\",\n" +
                "    \"ver\":1,\n" +
                "    \"prev_block\":\"00000000000007d0f98d9edca880a6c124e25095712df8952e0439ac7409738a\",\n" +
                "    \"mrkl_root\":\"935aa0ed2e29a4b81e0c995c39e06995ecce7ddbebb26ed32d550a72e8200bf5\",\n" +
                "    \"time\":1322131230,\n" +
                "    \"bits\":437129626,\n" +
                "    \"nonce\":2964215930,\n" +
                "    \"n_tx\":22,\n" +
                "    \"size\":9195,\n" +
                "    \"block_index\":818044,\n" +
                "    \"main_chain\":true,\n" +
                "    \"height\":154595,\n" +
                "    \"received_time\":1322131301,\n" +
                "    \"relayed_by\":\"108.60.208.156\",\n" +
                "    \"tx\":[]\n" +
                "}";

        Block block = Parser.fromJson(json, Block.class);

        assertEquals("0000000000000bae09a7a393a8acded75aa67e46cb81f7acaa5ad94f9eacd103", block.getHash());
        assertEquals(1, block.getVersion());
        assertEquals("00000000000007d0f98d9edca880a6c124e25095712df8952e0439ac7409738a", block.getPreviousBlock());
        assertEquals("935aa0ed2e29a4b81e0c995c39e06995ecce7ddbebb26ed32d550a72e8200bf5", block.getMerkelRoot());
        assertEquals(1322131230, block.getTime());
        assertEquals(437129626, block.getBits());
        assertEquals(2964215930L, block.getNonce());
        assertEquals(22, block.getNumberOfTransactions());
        assertEquals(9195, block.getSize());
        assertEquals(818044, block.getBlockIndex());
        assertEquals(true, block.isMainChain());
        assertEquals(154595, block.getHeight());
        assertEquals(1322131301, block.getReceivedTime());
        assertEquals("108.60.208.156", block.getRelayedBy());
        assertEquals(0, block.getTransactions().size());
    }
}