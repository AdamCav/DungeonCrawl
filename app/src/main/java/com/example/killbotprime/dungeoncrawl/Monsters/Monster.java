package com.example.killbotprime.dungeoncrawl.Monsters;

import com.example.killbotprime.dungeoncrawl.Character;
import com.example.killbotprime.dungeoncrawl.Effect;
import com.example.killbotprime.dungeoncrawl.Effects;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Randomizer;

public abstract class Monster extends Mob {
    MonsterAbility[] monsterAbilities;
    int hitpointMin=1;
    int hitpointMax=1;
    int initiative=0;

    public MonsterAbility[] getMonsterAbilities() {
        return monsterAbilities;
    }

    public int getHitpointMin() {
        return hitpointMin;
    }

    public int getHitpointMax() {
        return hitpointMax;
    }

    public MonsterAbility getMonsterAction(){
        return getMonsterAbilities()[Randomizer.roll(0,getMonsterAbilities().length,-1)];
    }

    public void setMonsterAbilities(MonsterAbility[] monsterAbilities) {
        this.monsterAbilities = monsterAbilities;
    }

    public void setHitpointMin(int hitpointMin) {
        this.hitpointMin = hitpointMin;
    }

    public void setHitpointMax(int hitpointMax) {
        this.hitpointMax = hitpointMax;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void doAbility(MonsterAbility monsterAbility,Character target){
        if(monsterAbility.effect.equals(Effects.DEALDAMAGE)){
            Effect.dealDamage(target,Randomizer.roll(monsterAbility.damageMin,monsterAbility.damageMax,0));
        }
    }
}
