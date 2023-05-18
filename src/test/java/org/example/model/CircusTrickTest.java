package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircusTrickTest {

    @Test
    void animalesDeCirco(){
        CircusTrick circus = new CircusTrick();
        Assertions.assertNotNull(circus);
    }

    @Test
    void leonRuge(){
        CircusTrick circus = new CircusTrick();
        Assertions.assertEquals("roarroar", circus.getRugir());
    }

    @Test
    void vacaMugido(){
        CircusTrick circus = new CircusTrick();
        Assertions.assertEquals("moomoo", circus.getMugidos());
    }

    @Test
    void dogDance(){
        CircusTrick circus = new CircusTrick();
        Assertions.assertEquals("blabla", circus.getDance());
    }

    @Test
    void tortugaDuerme(){
        CircusTrick circus = new CircusTrick();
        Assertions.assertEquals("zzzzzz", circus.getDuerme());
    }

    @Test
    void gatoMaulla() {
        CircusTrick circus = new CircusTrick();
        Assertions.assertEquals("miumiu", circus.getSalta());
    }
}