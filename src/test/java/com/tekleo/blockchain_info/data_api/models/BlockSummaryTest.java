package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.utils.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockSummaryTest {
    @Test
    public void test1() {
        String json = "    {\n" +
                "        \"height\" : 166107,\n" +
                "        \"hash\" : \"00000000000003823fa3667d833a354a437bdecf725f1358b17f949c991bfe0a\",\n" +
                "        \"time\" : 1328830483\n" +
                "    }";

        BlockSummary blockSummary = Parser.fromJson(json, BlockSummary.class);
        assertEquals(166107, blockSummary.getHeight());
        assertEquals("00000000000003823fa3667d833a354a437bdecf725f1358b17f949c991bfe0a", blockSummary.getHash());
        assertEquals(1328830483, blockSummary.getTime());

    }

    @Test
    public void test2() {
        String json = "    {\n" +
                "        \"height\" : 166104,\n" +
                "        \"hash\" : \"00000000000008a34f292bfe3098b6eb40d9fd40db65d29dc0ee6fe5fa7d7995\",\n" +
                "        \"time\" : 1328828041\n" +
                "    }";

        BlockSummary blockSummary = Parser.fromJson(json, BlockSummary.class);
        assertEquals(166104, blockSummary.getHeight());
        assertEquals("00000000000008a34f292bfe3098b6eb40d9fd40db65d29dc0ee6fe5fa7d7995", blockSummary.getHash());
        assertEquals(1328828041, blockSummary.getTime());
    }
}