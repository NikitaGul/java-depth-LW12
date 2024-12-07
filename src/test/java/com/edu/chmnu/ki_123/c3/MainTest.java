package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void chipperWithoutSymbol(){
        String sentence = "Hello";

        int shift = 3;

        String crypts = Main.chipper(sentence, shift);

        assertEquals(crypts, "Khoor");
    }

    @Test
    void chipperWithSymbol(){
        String sentence = "It is, me and My, Bad Impression.";

        int shift = 3;

        String crypts = Main.chipper(sentence, shift);

        assertEquals(crypts, "Lw lv, ph dqg Pb, Edg Lpsuhvvlrq.");
    }

    @Test
    void dechipperWithoutSymbol(){
        String sentence = "Lw lv frro";

        int shift = 3;

        String crypts = Main.dechipper(sentence, shift);

        assertEquals(crypts, "It is cool");
    }

    @Test
    void dechipperWithSymbol(){
        String sentence = "Wrgdb, L wklqn, L pdnlqj doo pb sodqv.";

        int shift = 3;

        String crypts = Main.dechipper(sentence, shift);

        assertEquals(crypts, "Today, I think, I making all my plans.");
    }


}