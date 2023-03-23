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

    @Test
    void updateQuality7Days() {
        //Given
        Item[] items = new Item[4];
        items[0] = new Item("lambda product", 3,7);
        items[1] = new Item("Kryptonite", 0, 80);
        items[2] = new Item("Comté",5,10);
        items[3] = new Item("Pass VIP Concert", 12,10);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("lambda product" + ", " + -4 + ", " + 0, items[0].toString());
        assertEquals("Kryptonite" + ", " + 0 + ", " + 80, items[1].toString());
        assertEquals("Comté" + ", " + -2 + ", " + 19, items[2].toString());
        assertEquals("Pass VIP Concert" + ", " + 5 + ", " + 22, items[3].toString());
    }

    @Test
    void updateQuality7Days0Quality() {
        //Given
        Item[] items = new Item[4];
        items[0] = new Item("lambda product", 3,0);
        items[1] = new Item("Kryptonite", 0, 80);
        items[2] = new Item("Comté",3,0);
        items[3] = new Item("Pass VIP Concert", 3,0);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("lambda product" + ", " + -4 + ", " + 0, items[0].toString());
        assertEquals("Kryptonite" + ", " + 0 + ", " + 80, items[1].toString());
        assertEquals("Comté" + ", " + -4 + ", " + 11, items[2].toString());
        assertEquals("Pass VIP Concert" + ", " + -4 + ", " + 0, items[3].toString());
    }

    @Test
    void updateQuality7DaysLambdaProduct() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("lambda product", 3,5);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("lambda product" + ", " + -4 + ", " + 0, items[0].toString());
    }
    @Test
    void updateQuality7DaysKryptonite() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("Kryptonite", 0, 80);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("Kryptonite" + ", " + 0 + ", " + 80, items[0].toString());
    }
    @Test
    void updateQuality7DaysComte() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("Comté",3,5);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("Comté" + ", " + -4 + ", " + 16, items[0].toString());
    }
    @Test
    void updateQuality7DaysPass() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("Pass VIP Concert", 3,5);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("Pass VIP Concert" + ", " + -4 + ", " + 0, items[0].toString());
    }

    @Test
    void updateQuality7DaysLambdaProduct15quality23sellin() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("lambda product", 23,15);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("lambda product" + ", " + 16 + ", " + 8, items[0].toString());
    }

    @Test
    void updateQuality7DaysComte25Quality() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("Comté",4,25);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("Comté" + ", " + -3 + ", " + 35, items[0].toString());
    }
    @Test
    void updateQuality7DaysPass13Sellin() {
        //Given
        Item[] items = new Item[1];
        items[0] = new Item("Pass VIP Concert", 13,5);
        Magasin target = new Magasin(items);

        //WHEN
        for (int i = 0 ; i<7 ; i++) {
            target.updateQuality();
        }

        //THEN
        assertEquals("Pass VIP Concert" + ", " + 6 + ", " + 16, items[0].toString());
    }


}
