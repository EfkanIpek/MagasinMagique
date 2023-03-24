package com.magasin;

public class LambdaProduct extends Item implements Updatable {
    private final int qualityPerDay = 1;
    private final int sellInPerDay = 1;
    public LambdaProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.updateSellIn();
        this.updateQuality();
    }

    private void updateQuality() {
        this.quality = Math.max(0, this.quality - qualityPerDay);
    }

    private void updateSellIn() {
        this.sellIn -= sellInPerDay;
    }
}
