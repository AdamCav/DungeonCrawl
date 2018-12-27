package com.example.killbotprime.dungeoncrawl.Items;

/**
 * A weapon wielded by a character, determining their melee damage
 */
public abstract class Weapon {
    int minDamage;
    int maxDamage;
    int accuracy;
    int range;

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getRange() {
        return range;
    }
}
