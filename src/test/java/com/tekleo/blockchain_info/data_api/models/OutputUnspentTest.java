package com.tekleo.blockchain_info.data_api.models;

import com.tekleo.blockchain_info.data_api.core.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OutputUnspentTest {
    @Test
    public void test() {
        String json = "{\n" +
                "            \"tx_age\":\"1322659106\",\n" +
                "            \"tx_hash\":\"e6452a2cb71aa864aaa959e647e7a4726a22e640560f199f79b56b5502114c37\",\n" +
                "            \"tx_index\":\"12790219\",\n" +
                "            \"tx_output_n\":\"0\",\n" +
                "            \"script\":\"76a914641ad5051edd97029a003fe9efb29359fcee409d88ac\",\n" +
                "            \"value\":\"5000661330\"\n" +
                "        }";

        OutputUnspent outputUnspent = Parser.fromJson(json, OutputUnspent.class);
        //assertEquals("1322659106", outputUnspent.getTransactionAge());
        assertEquals("e6452a2cb71aa864aaa959e647e7a4726a22e640560f199f79b56b5502114c37", outputUnspent.getTransactionHash());
        assertEquals("12790219", outputUnspent.getTransactionIndex());
        assertEquals("0", outputUnspent.getTransactionNumberOfOutputs());
        assertEquals("76a914641ad5051edd97029a003fe9efb29359fcee409d88ac", outputUnspent.getScript());
        assertEquals("5000661330", outputUnspent.getValue());
    }
}