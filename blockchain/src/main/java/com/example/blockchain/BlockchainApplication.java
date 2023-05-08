package com.example.blockchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlockchainApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlockchainApplication.class, args);
        BlockChain blockChain = new BlockChain();
        // we will instantiate the Miner class to fetch the minor object.
        Miner miner = new Miner();

//we have created the genesis or block 0
        // we will pass the id, the transaction string and previous hash
        //as this is the first block so we have to manually provide the previous hash
        Block block0 = new Block(0,"transaction1",Constants_Program.GENESIS_PREV_HASH);

        //miner will take the transaction and will mine the block
        //to find the hash value and miner will append the block to Blockchain
        miner.mine(block0, blockChain);

        //we will create the next block
        //we pass id, traction and this time the previous hash will contain
        // the hash value of Genesis block
        Block block1 = new Block(1,"transaction2",blockChain.getBlockChain().get(blockChain.size()-1).getHash());

        miner.mine(block1, blockChain);

        Block block2 = new Block (2,"transaction3",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block2, blockChain);
        System.out.println("\n"+ "BLOCKCHAIN:\n"+blockChain);
        System.out.println("Miner's reward: " + miner.getReward());
    }
}
