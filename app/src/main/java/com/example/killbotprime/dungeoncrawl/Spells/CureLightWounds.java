package com.example.killbotprime.dungeoncrawl.Spells;

import com.example.killbotprime.dungeoncrawl.Battle.Combatant;
import com.example.killbotprime.dungeoncrawl.Effect;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Randomizer;

import com.example.killbotprime.dungeoncrawl.Character;


public class CureLightWounds extends Spell {
    public CureLightWounds(){
        String name="Cure Light Wounds";
        String shortDescription="A soft golden glow falls over them";
        int spellLevel = 1;
        this.name=name;
        this.shortDescription=shortDescription;
        this.spellLevel=spellLevel;
    }
    @Override
    public void effect(Combatant target, Character user) {
        Effect.restoreHP(target, Randomizer.roll(1,6,user.getLevel()));
        ((Character) user).reduceSpellLevel(spellLevel);
    }
}
