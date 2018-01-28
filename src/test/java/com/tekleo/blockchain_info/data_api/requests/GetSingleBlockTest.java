package com.tekleo.blockchain_info.data_api.requests;

import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.Block;
import com.tekleo.blockchain_info.data_api.models.Transaction;
import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSingleBlockTest {
    @Test
    public void test() {
        // Create request
        Request request = new GetSingleBlock("0000000000000000005ffe9e925f190b64efd6186007e1fb5d90544185bc5d25");
        System.out.println(request.getUrl());

        // Get response as JSON
        String json = request.send();

        // Form the Model object
        Block block = Parser.fromJson(json, Block.class);

        // Test basic data fields
        assertEquals("0000000000000000005ffe9e925f190b64efd6186007e1fb5d90544185bc5d25", block.getHash());
        assertEquals(536870912, block.getVersion());
        assertEquals("0000000000000000004ab6ac897ea3f293b07a67346e481909907beeed87479d", block.getPreviousBlock());
        assertEquals("07f6d18c36754a7decd9ca9279d1c1c15ca4180b68647496f03f09fb4c15854c", block.getMerkelRoot());
        assertEquals(1516494272, block.getTime());
        assertEquals(394155916, block.getBits());
        assertEquals(167845839, block.getFee());
        assertEquals(1315490724, block.getNonce());
        assertEquals(1196, block.getNumberOfTransactions());
        assertEquals(1787648, block.getSize());
        assertEquals(1667755, block.getBlockIndex());
        assertEquals(true, block.isMainChain());
        assertEquals(505255, block.getHeight());
        assertEquals(1516494272, block.getReceivedTime());
        assertEquals("0.0.0.0", block.getRelayedBy());

        // Test transactions
        assertEquals(block.getNumberOfTransactions(), block.getTransactions().size());
        for (Transaction transaction : block.getTransactions()) {
            assertEquals(transaction.getVolumeInputSize(), transaction.getInputs().size());
            assertEquals(transaction.getVolumeOutputSize(), transaction.getOutputs().size());
        }
    }
}