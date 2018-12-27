package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Mob;

public class Initiative implements Comparable<Initiative> {
    Combatant combatant;
    int initiative;
//    int partyPosition;

    public Initiative(Combatant combatant, int initiative){
        this.initiative=initiative;
        this.combatant=combatant;
//        this.partyPosition=partyPosition;
    }


    @Override
    public int compareTo(Initiative other) {
        return initiative-other.initiative;
    }

    public Combatant getCombatant() {
        return combatant;
    }

    public void setCombatant(Combatant combatant) {
        this.combatant = combatant;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

//    public int getPartyPosition() {
//        return partyPosition;
//    }
//
//    public void setPartyPosition(int partyPosition) {
//        this.partyPosition = partyPosition;
//    }
}
