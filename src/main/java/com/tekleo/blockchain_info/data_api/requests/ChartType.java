package com.tekleo.blockchain_info.data_api.requests;

/**
 * All the possible charts
 *
 * For more details:
 * @see <a href="https://blockchain.info/charts">BlockchainInfo Charts</a>
 *
 * @author Leo Ertuna
 */
public enum ChartType {
    // Currency Statistics
    //------------------------------------------------------------------------------------------------------------------
    // The total number of bitcoins that have already been mined.
    BITCOINS_IN_CIRCULATION("total-bitcoins"),

    // Average USD market price across major bitcoin exchanges.
    MARKET_PRICE_USD("market-price"),

    // The total USD value of bitcoin supply in circulation.
    MARKET_CAPITALIZATION("market-cap"),

    // The total USD value of trading volume on major bitcoin exchanges.
    USD_EXCHANGE_TRADE_VOLUME("trade-volume"),
    //------------------------------------------------------------------------------------------------------------------



    // Block Details
    //------------------------------------------------------------------------------------------------------------------
    // The total size of all block headers and transactions.
    BLOCKCHAIN_SIZE("blocks-size"),

    // The average block size in MB.
    AVERAGE_BLOCK_SIZE("avg-block-size"),

    // The total number of blocks mined but ultimately not attached to the main Bitcoin blockchain.
    ORPHANED_BLOCKS("n-orphaned-blocks"),

    // The average number of transactions per block.
    TRANSACTIONS_PER_BLOCK("n-transactions-per-block"),

    // The median time for a transaction to be accepted into a mined block.
    MEDIAN_TRANSACTION_CONFIRMATION_TIME("median-confirmation-time"),

    // % of the last 2016 blocks that signal support for the activation of the SegWit soft-fork.
    SEGWIT_ADOPTION("bip-9-segwit"),

    // Percentage of the last 200 blocks that signal support for Bitcoin Unlimited
    PERCENTAGE_OF_BLOCKS_SIGNALLING_BITCOIN_UNLIMITED_SUPPORT("bitcoin-unlimited-share"),

    // Percentage of blocks signalling for the New York Agreement over the last 200 blocks
    NEW_YORK_AGREEMENT_SUPPORT("nya-support"),
    //------------------------------------------------------------------------------------------------------------------



    // Mining Information
    //------------------------------------------------------------------------------------------------------------------
    // The estimated number of tera hashes per second the Bitcoin network is performing.
    HASH_RATE("hash-rate"),

    // An estimation of hashrate distribution amongst the largest mining pools
    HASHRATE_DISTRIBUTION("pools"),

    // A relative measure of how difficult it is to find a new block.
    DIFFICULTY("difficulty"),

    // Total value of coinbase block rewards and transaction fees paid to miners.
    MINING_REVENUE("miners-revenue"),

    // The total value of all transaction fees paid to miners.
    TOTAL_TRANSACTION_FEES_BTC("transaction-fees"),

    // The total value of all transaction fees paid to miners (not including the coinbase value of block rewards).
    TOTAL_TRANSACTION_FEES_USD("ransaction-fees-usd"),

    // A chart showing miners revenue as percentage of the transaction volume.
    COST_OF_TRANSACTION_VOLUME("cost-per-transaction-percent"),

    // A chart showing miners revenue divided by the number of transactions.
    COST_PER_TRANSACTION("cost-per-transaction"),
    //------------------------------------------------------------------------------------------------------------------



    // Network Activity
    //------------------------------------------------------------------------------------------------------------------
    // The total number of unique addresses used on the Bitcoin blockchain.
    UNIQUE_ADDRESSES("n-unique-addresses"),

    // The number of daily confirmed Bitcoin transactions.
    TOTAL_NUMBER_OF_TRANSACTIONS_PER_DAY("n-transactions"),

    // Total number of transactions.
    TOTAL_NUMBER_OF_TRANSACTIONS("n-transactions-total"),

    // The number of Bitcoin transactions added to the mempool per second.
    TRANSACTIONS_RATE("transactions-per-second"),

    // The number of transactions waiting to be confirmed.
    MEMPOOL_TRANSACTION_COUNT("mempool-count"),

    // The rate at which the mempool is growing per second.
    MEMPOOL_SIZE_GROWTH("mempool-growth"),

    // The aggregate size of transactions waiting to be confirmed.
    MEMPOOL_SIZE("mempool-size"),

    // Breakdown of the mempool by fee level
    MEMPOOL_STATE_BY_FEE_LEVEL("mempool-state-by-fee-level"),

    // The number of unspent Bitcoin transactions outputs (UTXO set size).
    NUMBER_OF_UNSPENT_TRANSACTIONS_OUTPUTS("utxo-count"),

    // The total number of Bitcoin transactions, excluding the 100 most popular addresses.
    TRANSACTION_VOLUME_EXCLUDING_POPULAR_ADDRESSES("n-transactions-excluding-popular"),

    // The total number of Bitcoin transactions per day excluding long transaction chains.
    TRANSACTION_VOLUME_EXCLUDING_LONG_CHAINS("n-transactions-excluding-chains-longer-than-100"),

    // The total value of all transaction outputs per day.
    TOTAL_OUTPUT_VALUE("output-volume"),

    // The total estimated value of transactions on the Bitcoin blockchain.
    ESTIMATED_TRANSACTION_VALUE("estimated-transaction-volume"),

    // The estimated transaction value in USD value.
    ESTIMATED_USD_TRANSACTION_VALUE("estimated-transaction-volume-usd"),
    //------------------------------------------------------------------------------------------------------------------



    // Wallet Activity
    //------------------------------------------------------------------------------------------------------------------
    BLOCKCHAIN_WALLET_USERS("my-wallet-n-users");
    //------------------------------------------------------------------------------------------------------------------



    // Enum Logic
    //------------------------------------------------------------------------------------------------------------------
    private String restName;

    private ChartType(final String restName) {
        this.restName = restName;
    }

    public String getRestName() {
        return restName;
    }
    //------------------------------------------------------------------------------------------------------------------
}