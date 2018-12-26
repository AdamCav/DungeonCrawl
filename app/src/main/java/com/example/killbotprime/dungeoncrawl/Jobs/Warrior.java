package com.example.killbotprime.dungeoncrawl.Jobs;

import com.example.killbotprime.dungeoncrawl.Spells.Spell;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Warrior extends Job {
    //private static Warrior single_instance = null;

    public Warrior(){
        super();
        hitDice=10;
        learnsSpells=false;
    }
//
//    public static Warrior getInstance(){
//        if (single_instance==null){
//            single_instance=new Warrior();
//        }
//        return single_instance;
//    }

}
