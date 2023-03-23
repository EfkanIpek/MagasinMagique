package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


    @Test
    void updateQuality13Days() {
        //Given
        Item[] items = new Item[4];
        items[0] = new Item("lambda product", 3,7);
        items[1] = new Item("Kryptonite", 0, 80);
        items[2] = new Item("Comté",5,10);
        items[3] = new Item("Pass VIP Concert", 12,10);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<13 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("lambda product" + ", " + -10 + ", " + 0, items[0].toString());
        assertEquals("Kryptonite" + ", " + 0 + ", " + 80, items[1].toString());
        assertEquals("Comté" + ", " + -8 + ", " + 31, items[2].toString());
        assertEquals("Pass VIP Concert" + ", " + -1 + ", " + 0, items[3].toString());
    }
}
