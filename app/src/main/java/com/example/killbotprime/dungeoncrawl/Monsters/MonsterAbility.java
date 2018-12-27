package com.example.killbotprime.dungeoncrawl.Monsters;

import com.example.killbotprime.dungeoncrawl.Effect;
import com.example.killbotprime.dungeoncrawl.Effects;

/**
 * This defines an attack a monster might use, no weapons, or spells, just abilities
 */
public class MonsterAbility {
    int uses;
    int damageMin;
    int damageMax;
    String description;
    Effects effect;

    public MonsterAbility(int uses, int damageMin,int damageMax,String description, Effects effect){
        this.uses=uses;
        this.damageMin=uses;
        this.damageMax=damageMax;
        this.description=description;
        this.effect=effect;

    }

}
