package com.example.killbotprime.dungeoncrawl.Spells;

import com.example.killbotprime.*;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Character;

public abstract class Spell{
    public final static int SPELL_LEVELS=5;

    String name="DEFAULT_ERROR_SPELL";
    String shortDescription="DEFAULT_ERROR_DESCRIPTION";

    public void perform(Mob[] target, Character user) {
        System.out.println(user.getName()+" casts "+name);
        for (Mob t : target){
            effect(t,user);
        }
    }

    public void effect (Mob target, Character user){

    }

}
