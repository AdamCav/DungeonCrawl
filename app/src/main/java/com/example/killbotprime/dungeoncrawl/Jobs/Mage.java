package com.example.killbotprime.dungeoncrawl.Jobs;

import com.example.killbotprime.dungeoncrawl.Spells.MagicMissile;
import com.example.killbotprime.dungeoncrawl.Spells.Spell;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mage extends Job {

    public Mage(){
        super();
        hitDice=6;
        learnsSpells=true;
        learnableSpells.get(0).add(new MagicMissile());
    }
}
