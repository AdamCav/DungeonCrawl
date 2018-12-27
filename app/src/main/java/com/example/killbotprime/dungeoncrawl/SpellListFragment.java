package com.example.killbotprime.dungeoncrawl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * The display for spells in combat
 */
public class SpellListFragment extends android.app.Fragment {
        private View view;
        private LinearLayout linearLayout;

        ListView spellList;


        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            view = inflater.inflate(R.layout.spell_list_fragment,container,false);
            return view;
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState){
                spellList = getView().findViewById(R.id.spellListViewer);
                ArrayAdapter spellListAdapter = new ArrayAdapter<>(getContext(),R.layout.monster_list,((MainActivity)this.getActivity()).getSpellList());
                spellList.setAdapter(spellListAdapter);
                spellList.setClickable(true);
                spellList.setOnItemClickListener(spellSelect);
        }

        @Override
        public void onStop() {
            super.onStop();
            ((MainActivity)this.getActivity()).log.setVisibility(View.VISIBLE);
            ((MainActivity) this.getActivity()).disableButtons=false;
        }

        private AdapterView.OnItemClickListener spellSelect = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(spellList.getItemAtPosition(position));
            }
        };

}
