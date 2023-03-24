package com.magasin;

public class LambdaProduct extends Item implements Updatable {
    public LambdaProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.updateSellIn();
        this.updateQuality();
    }

    protected void updateQuality() {
        if (sellIn>=0)
            this.quality = Math.max(0, this.quality - 1);
        else
            this.quality = Math.max(0, this.quality - 2);

    }

    protected void updateSellIn() {
        this.sellIn--;
    }
}
