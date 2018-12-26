package com.example.killbotprime.dungeoncrawl;

import java.util.LinkedList;

public class Party {
    Character[] partyOrder = new Character[6];

    public Party(LinkedList<Character> characters){
        int i=0;
        while (!characters.isEmpty()){
            partyOrder[i]=characters.remove();
            i++;
        }
    }

    public Character[] getPartyOrder() {
        return partyOrder;
    }

    public Character getPartyCharacter (int position){
        return partyOrder[position];
    }

    public String getStatusText(int charNumber){
        Character character = partyOrder[charNumber];
        String status=character.getName()+"\n"+character.getCurrentHitPoints()+"/"+character.getHitPoints();
        return status;
    }
}
