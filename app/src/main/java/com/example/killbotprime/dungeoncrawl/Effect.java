package com.example.killbotprime.dungeoncrawl;

import com.example.killbotprime.dungeoncrawl.Battle.Combatant;

public class Effect {

    /**
     * A list of potential effects an ability or attack may have.
     * @param target
     * @param amount
     * @param effect
     */
    public static void resolveEffect(Combatant target, int amount, Effects effect){
        int effectValue = effect.ordinal();
        if (effectValue==Effects.DEALDAMAGE.ordinal()){
            dealDamage(target,amount);
        } else if (effectValue==Effects.RESTOREHP.ordinal()){
            restoreHP(target,amount);
        }
    }

    public static void restoreHP(Combatant target, int amount){
        target.modifyHitPoints(amount);
        Log.write(target.getName()+ " restores "+amount+ "hit points.");
    }

    public static void dealDamage(Combatant target, int amount){
        target.modifyHitPoints(-amount);
        Log.write(target.getName()+ " loses "+amount+ " hit points.");

    }


}
