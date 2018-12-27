package com.example.killbotprime.dungeoncrawl.Battle;

/**
 * An in combat version of a player, consider making this just reference the character and extract as needed instead of creating at all.
 */
public abstract class Combatant {
    private String name;
    private int hitPoints;
    private int currentHitPoints;
    private int initiativeBonus;
    private boolean isACharacter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public void modifyHitPoints(int amount) { this.currentHitPoints=this.currentHitPoints+amount; }

    public int getInitiativeBonus() {
        return initiativeBonus;
    }

    public void setInitiativeBonus(int initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public boolean isACharacter() {
        return isACharacter;
    }

    public void setIsACharacter(boolean ACharacter) {
        isACharacter = ACharacter;
    }
}
