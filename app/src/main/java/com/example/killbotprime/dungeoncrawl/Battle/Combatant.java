package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Monsters.Monster;
import com.example.killbotprime.dungeoncrawl.Randomizer;

public class Combatant {
    Monster monster;
    int currentHitPoints;
    int maxHitPoints;

    public Combatant(Monster monster){
        maxHitPoints=Randomizer.roll(monster.getHitpointMin(),monster.getHitpointMax(),0);
        currentHitPoints=maxHitPoints;
        this.monster=monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public int getCurrentHitPoints(){
        return currentHitPoints;
    }

    public void reduceHP(int amount){
        currentHitPoints=-amount;
    }

    public boolean isDead(){
        return currentHitPoints<=0;
    }
}
