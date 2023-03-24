package com.magasin;

public class PassVip extends Item implements Updatable{
    public PassVip(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void update() {
        this.updateSellIn();
        this.updateQuality();
    }

    private void updateQuality() {
        if (sellIn>=10)
            quality++;
        if (sellIn<10 && sellIn>=5)
            quality+=2;
        if (sellIn<5 && sellIn>=0)
            quality+=3;
        if (sellIn<0)
            quality=0;
    }

    private void updateSellIn() {
        this.sellIn--;
    }
}
