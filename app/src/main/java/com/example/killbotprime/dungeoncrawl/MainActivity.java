package com.example.killbotprime.dungeoncrawl;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.killbotprime.dungeoncrawl.Battle.Actions;
import com.example.killbotprime.dungeoncrawl.Battle.Battlefield;
import com.example.killbotprime.dungeoncrawl.Battle.CharacterCombatant;
import com.example.killbotprime.dungeoncrawl.Battle.Combatant;
import com.example.killbotprime.dungeoncrawl.Battle.Initiative;
import com.example.killbotprime.dungeoncrawl.Battle.MonsterCombatant;
import com.example.killbotprime.dungeoncrawl.Items.Weapon;
import com.example.killbotprime.dungeoncrawl.Jobs.Jobs;
import com.example.killbotprime.dungeoncrawl.Locations.NewbieDungeon;
import com.example.killbotprime.dungeoncrawl.Monsters.Monster;
import com.example.killbotprime.dungeoncrawl.Monsters.MonsterGroup;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    Party party;
    GameState gameState;
    Battlefield battlefield;
    TextView[] partyStatus = new TextView[6];
    int turn=0;

    private SpellListFragment spellListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList<Character> characters = new LinkedList<>();
        characters.add(new Character(Jobs.WARRIOR,"Adam"));
        characters.add(new Character(Jobs.PRIEST,"Coltin"));
        characters.add(new Character(Jobs.WARRIOR,"Evan"));
        characters.add(new Character(Jobs.MAGE,"Eric"));
        characters.add(new Character(Jobs.THIEF,"Brendan"));
        characters.add(new Character(Jobs.MAGE,"Patrick"));
        party = new Party(characters);
        gameState = new GameState();
        gameState.location=new NewbieDungeon();
        gameState.party=party;
        battlefield = new Battlefield(gameState.location.getEncounter(),party);



        setUpDisplay();

        updateDisplay();




        System.out.println();
    }

    public void updateDisplay(){
        ListView monsterList = findViewById(R.id.monsterList);
        ListView log = findViewById(R.id.log);
        String[] monsters = new String[battlefield.getMonsterGroups().size()];
        int i=0;
        for (MonsterGroup m:battlefield.getMonsterGroups()){
            monsters[i] = m.toString();
            i++;
        }

        for (i=0;i<6;i++){
            partyStatus[i].setText(party.getStatusText(i));
            partyStatus[i].setTypeface(null,Typeface.NORMAL);
        }

        partyStatus[turn].setTypeface(null,Typeface.BOLD);

        ArrayAdapter monsterAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.monster_list,monsters);
        monsterList.setAdapter(monsterAdapter);

        String[] logTextArray =  Log.log.toArray(new String[Log.log.size()]);

        ArrayAdapter logAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.monster_list,logTextArray);
        log.setAdapter(logAdapter);

        log.setSelection(logAdapter.getCount()-1);

    }

    public void setUpDisplay(){

        partyStatus[0]=findViewById(R.id.textCharView1);
        partyStatus[0].setText(party.getStatusText(0));

        partyStatus[1]=findViewById(R.id.textCharView2);
        partyStatus[1].setText(party.getStatusText(1));

        partyStatus[2]=findViewById(R.id.textCharview3);
        partyStatus[2].setText(party.getStatusText(2));

        partyStatus[3]=findViewById(R.id.textCharview4);
        partyStatus[3].setText(party.getStatusText(3));

        partyStatus[4]=findViewById(R.id.textCharview5);
        partyStatus[4].setText(party.getStatusText(4));

        partyStatus[5]=findViewById(R.id.textCharview6);
        partyStatus[5].setText(party.getStatusText(5));
    }

    public void Attack(View view){

        battlefield.setAction(turn, Actions.ATTACK);
        turn++;
        if (turn>=6){
            turn=0;
            resolveTurn();
        }
        updateDisplay();
    }

    public void resolveTurn(){
        battlefield.setUpInitative();
        System.out.println();
        Combatant nextCombatant;

        while (!battlefield.initiativeIsEmpty()){
            nextCombatant=battlefield.nextTurn().getCombatant();
            if (nextCombatant.isACharacter()){
                CharacterCombatant combatant = (CharacterCombatant)nextCombatant;
                if (combatant.getAction().equals(Actions.ATTACK)){
                    Effect.dealDamage(battlefield.getEnemies().get(0),Randomizer.roll(combatant.getMinimumDamage(),combatant.getMaximumDamage(),0));
                }
            } else if (!nextCombatant.isACharacter()){
                MonsterCombatant combatant = (MonsterCombatant)nextCombatant;
                CharacterCombatant target = battlefield.getMobTarget(1);
                Monster enemy=combatant.getMonster();
                enemy.doAbility(enemy.getMonsterAbilities()[0],target);
            }

        }

        updateDisplay();
    }


}
