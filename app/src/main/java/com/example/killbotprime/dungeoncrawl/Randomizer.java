package com.example.killbotprime.dungeoncrawl;

import java.util.Random;

/**
 * IT ROLLS DICE
 */
public class Randomizer {
    static Random rand = new Random(System.currentTimeMillis());

    public static int roll(int min, int max, int modifier){


        return rand.nextInt(max+min+modifier);
    }
}
