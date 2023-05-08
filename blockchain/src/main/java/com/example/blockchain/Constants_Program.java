package com.example.blockchain;

public class Constants_Program {
    private void Constants() {

    }
    //difficult in mining is defined by the leading zeros
//here, the difficulty is set to 1 so, it will have 1 zero
    public static final int DIFFICULTY = 1;

    public static final double MINER_REWARD = 10;

    // previous hash value is going to contain all zeros because
//the Genesis block is the first block of the block chain.
//Therefor it has no previous block and we will manually assign it
    public static final String GENESIS_PREV_HASH = "0000000000000000000000000000000000000000000000000000000000000000";

}
