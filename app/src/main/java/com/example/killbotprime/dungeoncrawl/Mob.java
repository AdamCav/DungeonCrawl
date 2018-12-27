package com.example.killbotprime.dungeoncrawl;

/**
 * A being that exists in the game world, a character or monster atm
 */
public abstract class Mob {
    private String name;
    private int level;
    private int hitPoints;
    private int currentHitPoints;

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void modifyHitPoints(int amount) { this.currentHitPoints=this.currentHitPoints+amount; }
}
