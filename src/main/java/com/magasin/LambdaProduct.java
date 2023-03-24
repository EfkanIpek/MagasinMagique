package com.magasin;

public class LambdaProduct extends Item implements Updatable{
    public LambdaProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    private final int qualityPerDay = 1;
    private final int sellInPerDay = 1;

    @Override
    public void update() {
        this.updateSellIn();
        this.updateQuality();
    }

    private void updateQuality() {
        this.quality = Math.max(0,this.quality-qualityPerDay);
    }

    private void updateSellIn() {
        this.sellIn -= sellInPerDay;
    }
}
