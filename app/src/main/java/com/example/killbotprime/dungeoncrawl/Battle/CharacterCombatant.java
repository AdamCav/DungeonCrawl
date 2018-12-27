package com.example.killbotprime.dungeoncrawl.Battle;

import com.example.killbotprime.dungeoncrawl.Character;
import com.example.killbotprime.dungeoncrawl.Mob;
import com.example.killbotprime.dungeoncrawl.Spells.Spell;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CharacterCombatant extends Combatant {
    int toHit;
    int armorClass;
    int minimumDamage;
    int maximumDamage;
    boolean hasSpells;
    int[] currentSpellLevels = new int [5];
    List<LinkedList<Spell>> spellsKnown = new ArrayList<LinkedList<Spell>>();
    Actions action;
    Spell spellCast;

    public CharacterCombatant(Character character){
        setName(character.getName());
        setCurrentHitPoints(character.getCurrentHitPoints());
        setHitPoints(character.getHitPoints());
        toHit=(character.getAgility()-10)/2;
        armorClass=(character.getAgility()-10)/2;
        minimumDamage=character.getWeapon().getMinDamage()+(character.getStrength()-10)/2;
        maximumDamage=character.getWeapon().getMaxDamage()+(character.getStrength()-10)/2;
        hasSpells=character.hasSpells();
        setInitiativeBonus((character.getAgility()-10)/2);
        if (hasSpells){
            currentSpellLevels=character.getCurrentSpellLevels();
            spellsKnown=character.getSpellsKnown();
        }
        setIsACharacter(true);
    }

    public int getToHit() {
        return toHit;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getMinimumDamage() {
        return minimumDamage;
    }

    public int getMaximumDamage() {
        return maximumDamage;
    }

    public boolean HasSpells() {
        return hasSpells;
    }

    public int[] getCurrentSpellLevels() {
        return currentSpellLevels;
    }

    public List<LinkedList<Spell>> getSpellsKnown() {
        return spellsKnown;
    }

    public void setAction(Actions action, Spell spell){
        this.action=action;
        this.spellCast=spell;
    }

    public Actions getAction() {
        return action;
    }
}
