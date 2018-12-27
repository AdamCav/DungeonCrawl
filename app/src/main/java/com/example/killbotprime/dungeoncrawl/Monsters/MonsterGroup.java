package com.example.killbotprime.dungeoncrawl.Monsters;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * This is what makes up an encounter, a monster type and a # of that monster
 */
public class MonsterGroup {
    Monster monster;
    int count;

    public MonsterGroup(Monster monster, int count){
        this.monster=monster;
        this.count=count;
    }

    public Monster getMonster() {
        return monster;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return count+" "+monster.getName();
    }
}
