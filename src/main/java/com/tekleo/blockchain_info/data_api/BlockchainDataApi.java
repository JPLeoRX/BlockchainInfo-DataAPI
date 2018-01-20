package com.tekleo.blockchain_info.data_api;

import com.tekleo.blockchain_info.data_api.models.*;

import java.util.List;

public interface BlockchainDataApi {
    Block getSingleBlock(String blockHash);

    Transaction getSingleTransactions(String transactionHash);

    ChartData geChartData(String chartType);

    BlockHeight getBlockHeight(String blockHeight);

    Address getSingleAddress(String address, int limit, int offset);

    AddressMultiple getMultiAddress(List<String> addresses, int n, int offset);

    OutputsUnspent getUnspentOutputs(List<String> addresses, int limit, int confirmations);

    Balance getBalance(List<String> addresses);

    BlockLatest getLatestBlock();

    TransactionsUnconfirmed getUnconfirmedTransactions();

    Blocks getBlocksForTime(String timeInMilliSeconds);

    Blocks getBlocksForPool(String poolName);
}