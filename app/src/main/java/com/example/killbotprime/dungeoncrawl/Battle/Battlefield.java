package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Character;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Monsters.Monster;
import com.example.killbotprime.dungeoncrawl.Monsters.MonsterGroup;
import com.example.killbotprime.dungeoncrawl.Party;
import com.example.killbotprime.dungeoncrawl.Randomizer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * A list of the individuals involved in a fight
 */
public class Battlefield {
    ArrayList<MonsterGroup> monsterGroups;
    ArrayList<Combatant> enemies = new ArrayList<>();
    Party party;
    Actions partyActions[] = new Actions[6];
    PriorityQueue<Initiative> initiativeOrder = new PriorityQueue<Initiative>();


    public Battlefield(ArrayList<MonsterGroup> monsterGroups, Party party){
        this.monsterGroups=monsterGroups;
        this.party=party;
        for (MonsterGroup m:monsterGroups){
            for (int i=0;i<m.getCount();i++){
                enemies.add(new Combatant(m.getMonster()));
            }
        }


    }

    public void setUpInitative(){
        for (int i=0;i<6;i++){

            initiativeOrder.add(new Initiative(party.getPartyCharacter(i),Randomizer.roll(1,10,-(party.getPartyCharacter(i).getAgility()-10)%2),i));
        }

        for (Combatant c:enemies){
            initiativeOrder.add(new Initiative(c.getMonster(),Randomizer.roll(1,10,0),99));
        }
    }

    public Initiative nextTurn(){
        Initiative currentInitiative = initiativeOrder.remove();
        return currentInitiative;
    }

    public boolean initiativeIsEmpty(){
        return initiativeOrder.isEmpty();
    }

    public ArrayList<MonsterGroup> getMonsterGroups() {
        return monsterGroups;
    }

    public void setAction(int partyPosition,Actions action){
        partyActions[partyPosition]=action;
    }

    public Actions getCharacterAction(int position){
        return partyActions[position];
    }

    public ArrayList<Combatant> getEnemies() {
        return enemies;
    }

    public Party getParty() {
        return party;
    }

    public Actions[] getPartyActions() {
        return partyActions;
    }

    public PriorityQueue<Initiative> getInitiativeOrder() {
        return initiativeOrder;
    }

    public Character getMobTarget(int range){
        if (range==1){
            return party.getPartyCharacter(Randomizer.roll(0,2,0));
        } else {
            return party.getPartyCharacter(Randomizer.roll(0,5,0));
        }
    }
}
