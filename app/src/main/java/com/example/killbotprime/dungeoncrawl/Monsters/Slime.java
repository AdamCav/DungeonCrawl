package com.example.killbotprime.dungeoncrawl.Monsters;

import com.example.killbotprime.dungeoncrawl.Effects;
import com.example.killbotprime.dungeoncrawl.Mob;

public class Slime extends Monster {


    public Slime(){
       setName("Green Slime");
       setLevel(1);
        setHitpointMin(1);
        setHitpointMax(6);
        MonsterAbility[] monsterAbilities = {new MonsterAbility(-1,1,4,"Green Slime lunges!", Effects.DEALDAMAGE)};
        setMonsterAbilities(monsterAbilities);
    }
}
