package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.Block;
import com.tekleo.blockchain_info.data_api.models.BlockHeight;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetBlockHeightTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetBlockHeight(506054);
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        BlockHeight blockHeight = Parser.fromJson(json, BlockHeight.class);
        Block block = blockHeight.get(0);

        // Test basic data fields
        assertEquals(1, blockHeight.size());
        assertEquals("000000000000000000277dfc8b90c462ad63c330ddc629ec2c13cba240d4e7bb", block.getHash());
        assertEquals(536870912, block.getVersion());
        assertEquals("00000000000000000036580aadc30828b152566d6f987312aa6745dad7c2cfe1", block.getPreviousBlock());
        assertEquals("15aa9625f8009cbcd9d6ccf84867d97db598777a733bd82a3c8e6965183b0c45", block.getMerkelRoot());
        assertEquals(1516887874, block.getTime());
        assertEquals(392962374, block.getBits());
        assertEquals(24825724, block.getFee());
        assertEquals(866806310, block.getNonce());
        assertEquals(1181, block.getNumberOfTransactions());
        assertEquals(1045860, block.getSize());
        assertEquals(1669667, block.getBlockIndex());
        assertEquals(true, block.isMainChain());
        assertEquals(506054, block.getHeight());
        assertEquals(1516887874, block.getReceivedTime());
        assertEquals("0.0.0.0", block.getRelayedBy());
        assertEquals(1181, block.getTransactions().size());
    }
}