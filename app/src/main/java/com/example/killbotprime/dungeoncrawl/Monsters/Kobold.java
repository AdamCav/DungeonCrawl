package com.example.killbotprime.dungeoncrawl.Monsters;

import com.example.killbotprime.dungeoncrawl.Effects;

public class Kobold extends Monster {

    public Kobold(){
      MonsterAbility[] monsterAbilities = {new MonsterAbility(-1,2,5,"Kobold lashes out!", Effects.DEALDAMAGE)};
        setInitiative(0);
        setName("Kobold");
        setLevel(1);
        setHitpointMin(4);
        setHitpointMax(8);
        setMonsterAbilities(monsterAbilities);
    }
}
