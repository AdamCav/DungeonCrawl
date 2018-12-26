package com.example.killbotprime.dungeoncrawl.Monsters;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
