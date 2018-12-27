package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Character;

import java.util.LinkedList;

/**
 * A collection of the players, similar to a MobGroup. Made for battle.
 */
public class PartyCombatant {
    CharacterCombatant[] partyOrder = new CharacterCombatant[6];

    public PartyCombatant(Character[] characters){
        for (int i=0; i<characters.length;i++){
            partyOrder[i]=new CharacterCombatant(characters[i]);
        }
    }

    public CharacterCombatant[] getPartyOrder() {
        return partyOrder;
    }

    public CharacterCombatant getPartyCharacterCombatant (int position){
        return partyOrder[position];
    }

    public String getStatusText(int charNumber){
        CharacterCombatant character = partyOrder[charNumber];
        String status=character.getName()+"\n"+character.getCurrentHitPoints()+"/"+character.getHitPoints();
        return status;
    }
}
