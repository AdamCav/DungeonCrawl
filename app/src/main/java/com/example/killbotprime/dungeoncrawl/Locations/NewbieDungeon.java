package com.example.killbotprime.dungeoncrawl.Locations;

import com.example.killbotprime.dungeoncrawl.Monsters.Kobold;
import com.example.killbotprime.dungeoncrawl.Monsters.Monster;
import com.example.killbotprime.dungeoncrawl.Monsters.MonsterGroup;
import com.example.killbotprime.dungeoncrawl.Monsters.Slime;
import com.example.killbotprime.dungeoncrawl.Randomizer;

import java.util.ArrayList;

public class NewbieDungeon extends Location {

    public ArrayList<MonsterGroup> getEncounter(){
        int count;
        ArrayList<MonsterGroup> encounter = new ArrayList<>();
        count = Randomizer.roll(0,2,0);
        if (count>0){
            encounter.add(new MonsterGroup(new Kobold(),count));
        }
        count = Randomizer.roll(0,2,0);
        if (count>0){
            encounter.add(new MonsterGroup(new Slime(),count));
        }

        if (encounter.isEmpty()){
            encounter.add(new MonsterGroup(new Slime(),1));
        }
        return encounter;
    }

}
