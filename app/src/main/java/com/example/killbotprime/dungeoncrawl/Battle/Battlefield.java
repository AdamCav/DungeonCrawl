package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Character;
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
    ArrayList<MonsterCombatant> enemies = new ArrayList<>();
    PartyCombatant party;
    PriorityQueue<Initiative> initiativeOrder = new PriorityQueue<Initiative>();


    public Battlefield(ArrayList<MonsterGroup> monsterGroups, Party party){
        this.monsterGroups=monsterGroups;
        this.party=new PartyCombatant(party.getPartyOrder());
        for (MonsterGroup m:monsterGroups){
            for (int i=0;i<m.getCount();i++){
                enemies.add(new MonsterCombatant(m.getMonster()));
            }
        }


    }

    public void setUpInitative(){
        for (CharacterCombatant c: party.getPartyOrder()){
            initiativeOrder.add(new Initiative(c,Randomizer.roll(1,10,0)+c.getInitiativeBonus()));
        }

        for (MonsterCombatant m:enemies){
            initiativeOrder.add(new Initiative(m,Randomizer.roll(1,10,0)+m.getInitiativeBonus()));
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
        party.getPartyCharacterCombatant(partyPosition).setAction(action,null);
    }

    public Actions getCharacterAction(int position){
        return party.getPartyCharacterCombatant(position).getAction();
    }

    public ArrayList<MonsterCombatant> getEnemies() {
        return enemies;
    }

    public PartyCombatant getParty() {
        return party;
    }

    public PriorityQueue<Initiative> getInitiativeOrder() {
        return initiativeOrder;
    }

    public CharacterCombatant getMobTarget(int range){
        if (range==1){
            return party.getPartyCharacterCombatant(Randomizer.roll(0,2,0));
        } else {
            return party.getPartyCharacterCombatant(Randomizer.roll(0,5,0));
        }
    }
}
