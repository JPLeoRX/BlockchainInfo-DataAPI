package com.tekleo.blockchain_info.data_api;

import com.tekleo.blockchain_info.data_api.core.Parser;
import com.tekleo.blockchain_info.data_api.core.Request;
import com.tekleo.blockchain_info.data_api.models.*;
import com.tekleo.blockchain_info.data_api.requests.*;
import com.tekleo.blockchain_info.data_api.utils.ListUtils;

import java.util.List;

public class BlockchainDataApiImpl implements BlockchainDataApi {
    @Override
    public Block getSingleBlock(String blockHash) {
        Request request = new GetSingleBlock(blockHash);
        return Parser.fromJson(request.send(), Block.class);
    }

    @Override
    public Transaction getSingleTransaction(String transactionHash) {
        Request request = new GetSingleTransaction(transactionHash);
        return Parser.fromJson(request.send(), Transaction.class);
    }

    @Override
    public ChartData getChartData(ChartType chartType) {
        Request request = new GetChartData(chartType);
        return Parser.fromJson(request.send(), ChartData.class);
    }

    @Override
    public BlockHeight getBlockHeight(long blockHeight) {
        Request request = new GetBlockHeight(blockHeight);
        return Parser.fromJson(request.send(), BlockHeight.class);
    }

    @Override
    public Address getSingleAddress(String address) {
        return getSingleAddress(address, null, null);
    }

    @Override
    public Address getSingleAddress(String address, Integer limit, Integer offset) {
        GetSingleAddress request = new GetSingleAddress(address);
        if (limit != null)
            request.addParameterLimit(limit);
        if (offset != null)
            request.addParameterOffset(offset);
        return Parser.fromJson(request.send(), Address.class);
    }

    @Override
    public AddressMultiple getMultiAddress(List<String> addresses) {
        return getMultiAddress(addresses, null, null);
    }

    @Override
    public AddressMultiple getMultiAddress(String... addresses) {
        return getMultiAddress(ListUtils.toList(addresses));
    }

    @Override
    public AddressMultiple getMultiAddress(List<String> addresses, Integer n, Integer offset) {
        GetMultiAddress request = new GetMultiAddress(addresses);
        if (n != null)
            request.addParameterLimit(n);
        if (offset != null)
            request.addParameterOffset(offset);
        return Parser.fromJson(request.send(), AddressMultiple.class);
    }

    @Override
    public OutputsUnspent getUnspentOutputs(List<String> addresses) {
        return getUnspentOutputs(addresses, null, null);
    }

    @Override
    public OutputsUnspent getUnspentOutputs(String... addresses) {
        return getUnspentOutputs((ListUtils.toList(addresses)));
    }

    @Override
    public OutputsUnspent getUnspentOutputs(List<String> addresses, Integer limit, Integer confirmations) {
        GetUnspentOutputs request = new GetUnspentOutputs(addresses);
        if (limit != null)
            request.addParameterLimit(limit);
        if (confirmations != null)
            request.addParameterConfirmations(confirmations);
        return Parser.fromJson(request.send(), OutputsUnspent.class);
    }

    @Override
    public Balance getBalance(List<String> addresses) {
        Request request = new GetBalance(addresses);
        return Parser.fromJson(request.send(), Balance.class);
    }

    @Override
    public Balance getBalance(String... addresses) {
        return getBalance(ListUtils.toList(addresses));
    }

    @Override
    public BlockLatest getLatestBlock() {
        Request request = new GetLatestBlock();
        return Parser.fromJson(request.send(), BlockLatest.class);
    }

    @Override
    public TransactionsUnconfirmed getUnconfirmedTransactions() {
        Request request = new GetUnconfirmedTransactions();
        return Parser.fromJson(request.send(), TransactionsUnconfirmed.class);
    }

    @Override
    public Blocks getBlocksForTime(String timeInMilliSeconds) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Blocks getBlocksForPool(String poolName) {
        throw new RuntimeException("Not implemented");
    }
}