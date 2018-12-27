package com.example.killbotprime.dungeoncrawl.Spells;

import com.example.killbotprime.dungeoncrawl.Battle.Combatant;
import com.example.killbotprime.dungeoncrawl.Character;
import com.example.killbotprime.dungeoncrawl.Effect;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Randomizer;

public class MagicMissile extends Spell {

    public MagicMissile(){
        String name="Magic Missile";
        String shortDescription="A bolt of energy flies forth";
        int spellLevel = 1;
        this.name=name;
        this.shortDescription=shortDescription;
        this.spellLevel=spellLevel;
    }
    @Override
    public void effect(Combatant target, Character user) {
        Effect.dealDamage(target, Randomizer.roll(1,6,user.getLevel()));
        ((Character) user).reduceSpellLevel(spellLevel);
    }
}
