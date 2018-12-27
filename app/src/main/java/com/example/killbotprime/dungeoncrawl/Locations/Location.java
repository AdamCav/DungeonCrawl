package com.example.killbotprime.dungeoncrawl.Locations;

import com.example.killbotprime.dungeoncrawl.Monsters.MonsterGroup;

import java.util.ArrayList;

/**
 * A location is a dungeon, or zone, with its own map and monster spawns.
 */
public abstract class Location {

    public ArrayList<MonsterGroup> getEncounter(){
        return null;
    }

}
