package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Monsters.Monster;
import com.example.killbotprime.dungeoncrawl.Randomizer;

public class MonsterCombatant extends Combatant {
    Monster monster;

    public MonsterCombatant(Monster monster){
        setName(monster.getName());
        setHitPoints(Randomizer.roll(monster.getHitpointMin(),monster.getHitpointMax(),0));
        setCurrentHitPoints(getHitPoints());
        setIsACharacter(false);
        setInitiativeBonus(monster.getInitiative());
        this.monster=monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public int getCurrentHitPoints(){
        return getCurrentHitPoints();
    }


    public boolean isDead(){
        return getCurrentHitPoints()<=0;
    }
}
