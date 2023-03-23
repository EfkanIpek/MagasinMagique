package com.magasin;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[4];
        items[0] = new Item("lambda product", 23,7);
        items[1] = new Item("Kryptonite", 0, 80);
        items[2] = new Item("Comté",5,10);
        items[3] = new Item("Pass VIP Concert", 12,10);

        Magasin magasin = new Magasin(items);

        for (int i = 0 ; i<13 ; i++) {
            magasin.updateQuality();
            System.out.println(Arrays.toString(items));
        }
    }
}
