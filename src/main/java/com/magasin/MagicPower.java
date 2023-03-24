package com.magasin;

public class MagicPower extends LambdaProduct implements Updatable{
    public MagicPower(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public void update() {
        updateSellIn();
        updateQuality();
        updateQuality();
    }

}
