package com.example.blockchain;

public class Miner {
    private double reward;

    public void mine(Block block, BlockChain blockChain) {

        while(notGoldenHash(block)) {
            //generating the block hash
            block.generateHash();
            block.incrementNonce();
        }

        System.out.println(block+" has just mined...");
        System.out.println("Hash is: "+block.getHash());
        //appending the block to the blockchain
        blockChain.addBlock(block);
        //calculating the reward
        reward+=Constants_Program.MINER_REWARD;

    }

    // So miners will generate hash values until they find the right hash.
    //that matches with DIFFICULTY variable declared in class Constant
    public boolean notGoldenHash(Block block) {

        String leadingZeros = new String(new char[Constants_Program.DIFFICULTY]).replace('\0', '0');

        return !block.getHash().substring (0, Constants_Program.DIFFICULTY).equals (leadingZeros);
    }
    public double getReward() {
        return this.reward;
    }

}
