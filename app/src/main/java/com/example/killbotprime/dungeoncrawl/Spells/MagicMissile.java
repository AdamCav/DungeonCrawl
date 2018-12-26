package com.example.killbotprime.dungeoncrawl.Spells;

import com.example.killbotprime.dungeoncrawl.Character;
import com.example.killbotprime.dungeoncrawl.Effect;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Randomizer;

public class MagicMissile extends Spell {
    String name="Magic Missile";
    String shortDescription="A bolt of energy flies forth";
    int spellLevel = 1;
    @Override
    public void effect(Mob target, Character user) {
        Effect.dealDamage(target, Randomizer.roll(1,6,user.getLevel()));
        ((Character) user).reduceSpellLevel(spellLevel);
    }
}
