package com.example.killbotprime.dungeoncrawl;

public class Effect {

    public static void resolveEffect(Mob target, int amount, Effects effect){
        int effectValue = effect.ordinal();
        if (effectValue==Effects.DEALDAMAGE.ordinal()){
            dealDamage(target,amount);
        } else if (effectValue==Effects.RESTOREHP.ordinal()){
            restoreHP(target,amount);
        }
    }

    public static void restoreHP(Mob target, int amount){
        target.modifyHitPoints(amount);
        Log.write(target.getName()+ " restores "+amount+ "hit points.");
    }

    public static void dealDamage(Mob target, int amount){
        target.modifyHitPoints(-amount);
        Log.write(target.getName()+ " loses "+amount+ " hit points.");

    }


}
