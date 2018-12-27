package com.example.killbotprime.dungeoncrawl.Spells;

import com.example.killbotprime.*;
import com.example.killbotprime.dungeoncrawl.Battle.Combatant;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Character;

public abstract class Spell{
    public final static int SPELL_LEVELS=5;

    String name="DEFAULT_ERROR_SPELL";
    String shortDescription="DEFAULT_ERROR_DESCRIPTION";
    int spellLevel;



    public void perform(Combatant[] target, Character user) {
        System.out.println(user.getName()+" casts "+name);
        for (Combatant t : target){
            effect(t,user);
        }
    }

    public void effect (Combatant target, Character user){

    }

    @Override
    public String toString(){
        return name+" - "+shortDescription;
    }

}
