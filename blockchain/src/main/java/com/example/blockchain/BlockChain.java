package com.example.blockchain;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {
    //instantiating the list of blocks
    private List<Block> blockChain;

    public BlockChain() {
        //further, instantiating the list as an ArrayList
        this.blockChain = new ArrayList<>();
    }

    public void addBlock(Block block) {
        this.blockChain.add(block);
    }
    public List<Block> getBlockChain() {
        return this.blockChain;
    }
    public int size() {
        return this.blockChain.size();
    }

    @Override
    public String toString() {
        String blockChain = "";
        for(Block block : this.blockChain)
            blockChain+=block.toString()+"\n";
        return blockChain;
    }
}
