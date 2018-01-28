package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlocksTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"blocks\" : [\n" +
                "    {\n" +
                "        \"height\" : 166107,\n" +
                "        \"hash\" : \"00000000000003823fa3667d833a354a437bdecf725f1358b17f949c991bfe0a\",\n" +
                "        \"time\" : 1328830483\n" +
                "    },\n" +
                "    {\n" +
                "        \"height\" : 166104,\n" +
                "        \"hash\" : \"00000000000008a34f292bfe3098b6eb40d9fd40db65d29dc0ee6fe5fa7d7995\",\n" +
                "        \"time\" : 1328828041\n" +
                "    }]\n" +
                "}";

        Blocks blocks = Parser.fromJson(json, Blocks.class);

        BlockSummary blockSummary1 = blocks.get(0);
        assertEquals(166107, blockSummary1.getHeight());
        assertEquals("00000000000003823fa3667d833a354a437bdecf725f1358b17f949c991bfe0a", blockSummary1.getHash());
        assertEquals(1328830483, blockSummary1.getTime());

        BlockSummary blockSummary2 = blocks.get(1);
        assertEquals(166104, blockSummary2.getHeight());
        assertEquals("00000000000008a34f292bfe3098b6eb40d9fd40db65d29dc0ee6fe5fa7d7995", blockSummary2.getHash());
        assertEquals(1328828041, blockSummary2.getTime());
    }
}