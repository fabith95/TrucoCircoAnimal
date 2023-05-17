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
        circus.silbatoLeon();
        Assertions.assertEquals("rourou", circus.getRugir());
    }

    @Test
    void vacaMugido(){
        CircusTrick circus = new CircusTrick();
        circus.silbatoVaca();
        Assertions.assertEquals("muumuu", circus.getMugidos());
    }



}