package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Mob;

public class Initiative implements Comparable<Initiative> {
    Mob combatant;
    int initiative;
    int partyPosition;

    public Initiative(Mob combatant, int initiative,int partyPosition){
        this.initiative=initiative;
        this.combatant=combatant;
        this.partyPosition=partyPosition;
    }


    @Override
    public int compareTo(Initiative other) {
        return initiative-other.initiative;
    }

    public Mob getCombatant() {
        return combatant;
    }

    public void setCombatant(Mob combatant) {
        this.combatant = combatant;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getPartyPosition() {
        return partyPosition;
    }

    public void setPartyPosition(int partyPosition) {
        this.partyPosition = partyPosition;
    }
}
