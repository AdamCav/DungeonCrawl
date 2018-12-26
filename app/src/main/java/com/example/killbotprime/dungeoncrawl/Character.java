package com.example.killbotprime.dungeoncrawl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.killbotprime.dungeoncrawl.Items.CopperDagger;
import com.example.killbotprime.dungeoncrawl.Items.CopperSword;
import com.example.killbotprime.dungeoncrawl.Items.Fist;
import com.example.killbotprime.dungeoncrawl.Items.Quarterstaff;
import com.example.killbotprime.dungeoncrawl.Items.Weapon;
import com.example.killbotprime.dungeoncrawl.Jobs.Job;
import com.example.killbotprime.dungeoncrawl.Jobs.Jobs;
import com.example.killbotprime.dungeoncrawl.Jobs.Mage;
import com.example.killbotprime.dungeoncrawl.Jobs.Priest;
import com.example.killbotprime.dungeoncrawl.Jobs.Thief;
import com.example.killbotprime.dungeoncrawl.Jobs.Warrior;
import com.example.killbotprime.dungeoncrawl.Spells.Spell;

public class Character extends Mob {
    final int[] experienceToNextLevel = {100,300,700,1200,1800,2700,3700,4800,6000};
    Job job;
    int experience;

    int[] spellLevels = new int[5];
    int[] currentSpellLevels = new int [5];
    List<LinkedList<Spell>> spellsKnown = new ArrayList<LinkedList<Spell>>();

    int strength;
    int agility;
    int endurance;
    int power;
    int personality;

    Weapon weapon=new Fist();

    public void reduceSpellLevel(int level) {
        spellLevels[level]--;
    }

    public void assignStats (int strength, int agility, int endurance, int power, int personality){
        this.strength=strength;
        this.agility=agility;
        this.endurance=endurance;
        this.power=power;
        this.personality=personality;
    }

    public Character(Jobs job, String name){
        this.setName(name);
        if (job.equals(Jobs.WARRIOR)){
            assignStats(14,12,14,8,10);
            this.job=new Warrior();
            weapon=new CopperSword();
        } else if (job.equals(Jobs.THIEF)){
            assignStats(12,14,12,10,10);
            this.job=new Thief();
            weapon = new CopperDagger();
        } else if (job.equals(Jobs.PRIEST)){
            assignStats(10,10,14,8,14);
            this.job=new Priest();
            weapon = new Quarterstaff();
        } else if (job.equals(Jobs.MAGE)){
            assignStats(8,10,10,16,8);
            this.job=new Mage();
            weapon = new Quarterstaff();
        }
        if (this.job.learnsSpells()){
            List<LinkedList<Spell>> learnableSpells = this.job.getLearnableSpells();
            for (int i=0;i<Spell.SPELL_LEVELS;i++){
                spellsKnown.add(new LinkedList<Spell>());
            }
            spellLevels[0]=2;
            spellsKnown.get(0).add(learnableSpells.get(0).get(0));
        }
        setHitPoints(this.job.getHitDice());
        refresh();
    }

    public void refresh(){
        this.setCurrentHitPoints(this.getHitPoints());
        if (job.learnsSpells()) {
            for (int i = 0; i < Spell.SPELL_LEVELS; i++) {
                currentSpellLevels[i] = currentSpellLevels[i];
            }
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getPower() {
        return power;
    }

    public int getPersonality() {
        return personality;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
