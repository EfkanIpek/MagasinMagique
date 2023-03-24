package com.magasin;

public class Comte extends Item implements Updatable {
    public Comte(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void update() {
        this.updateSellIn();
        this.updateQuality();
    }

    private void updateQuality() {
        if (sellIn >= 0)
            quality++;
        else
            quality += 2;
    }

    private void updateSellIn() {
        this.sellIn--;
    }
}
