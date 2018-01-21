package com.tekleo.blockchain_info.data_api;

import com.tekleo.blockchain_info.data_api.models.*;

import java.util.List;

public interface BlockchainDataApi {
    public abstract Block getSingleBlock(String blockHash);

    public abstract Transaction getSingleTransaction(String transactionHash);

    public abstract ChartData getChartData(String chartType);

    public abstract BlockHeight getBlockHeight(String blockHeight);

    public abstract Address getSingleAddress(String address, int limit, int offset);

    public abstract AddressMultiple getMultiAddress(List<String> addresses, int n, int offset);

    public abstract OutputsUnspent getUnspentOutputs(List<String> addresses, int limit, int confirmations);

    public abstract Balance getBalance(List<String> addresses);

    public abstract BlockLatest getLatestBlock();

    public abstract TransactionsUnconfirmed getUnconfirmedTransactions();

    public abstract Blocks getBlocksForTime(String timeInMilliSeconds);

    public abstract Blocks getBlocksForPool(String poolName);
}