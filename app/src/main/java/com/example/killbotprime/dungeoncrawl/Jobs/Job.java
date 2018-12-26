package com.example.killbotprime.dungeoncrawl.Jobs;

import com.example.killbotprime.dungeoncrawl.Spells.Spell;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Job {
    int hitDice;
    boolean learnsSpells=false;
    List<LinkedList<Spell>> learnableSpells = new ArrayList<LinkedList<Spell>>();

    public Job (){
        for (int i=0;i<Spell.SPELL_LEVELS;i++){
            learnableSpells.add(new LinkedList<Spell>());
        }
    }

    public int getHitDice() {
        return hitDice;
    }

    public boolean learnsSpells(){
        return learnsSpells;
    }

    public List<LinkedList<Spell>> getLearnableSpells() {
        return learnableSpells;
    }
}
