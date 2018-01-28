package com.tekleo.blockchain_info.data_api;

import com.tekleo.blockchain_info.data_api.models.*;
import com.tekleo.blockchain_info.data_api.requests.ChartType;

import java.util.List;

public interface BlockchainDataApi {
    public abstract Block getSingleBlock(String blockHash);

    public abstract Transaction getSingleTransaction(String transactionHash);

    public abstract ChartData getChartData(ChartType chartType);

    public abstract BlockHeight getBlockHeight(long blockHeight);

    public abstract Address getSingleAddress(String address);

    public abstract Address getSingleAddress(String address, Integer limit, Integer offset);

    public abstract AddressMultiple getMultiAddress(List<String> addresses);

    public abstract AddressMultiple getMultiAddress(String ... addresses);

    public abstract AddressMultiple getMultiAddress(List<String> addresses, Integer n, Integer offset);

    public abstract OutputsUnspent getUnspentOutputs(List<String> addresses);

    public abstract OutputsUnspent getUnspentOutputs(String ... addresses);

    public abstract OutputsUnspent getUnspentOutputs(List<String> addresses, Integer limit, Integer confirmations);

    public abstract Balance getBalance(List<String> addresses);

    public abstract Balance getBalance(String ... addresses);

    public abstract BlockLatest getLatestBlock();

    public abstract TransactionsUnconfirmed getUnconfirmedTransactions();

    public abstract Blocks getBlocksForTime(String timeInMilliSeconds);

    public abstract Blocks getBlocksForPool(String poolName);
}