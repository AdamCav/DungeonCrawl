package com.example.killbotprime.dungeoncrawl.Jobs;

import com.example.killbotprime.dungeoncrawl.Spells.CureLightWounds;
import com.example.killbotprime.dungeoncrawl.Spells.Spell;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Priest extends Job {

    public Priest(){
        super();
        hitDice=8;
        learnsSpells=true;
        learnableSpells.get(0).add(new CureLightWounds());
    }
}
