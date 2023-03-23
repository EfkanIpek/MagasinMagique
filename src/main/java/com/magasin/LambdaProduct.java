package com.magasin;

public class LambdaProduct extends Item implements Updatable{
    public LambdaProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.updateQuality();
        this.updateSellIn();
    }

    private void updateQuality() {
        this.quality = Math.max(0,this.quality-1);
    }

    private void updateSellIn() {
        this.sellIn--;
    }
}
