package com.example.killbotprime.dungeoncrawl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * The display for spells in combat
 */
public class SpellListFragment extends android.app.Fragment {
        private View view;
        private LinearLayout linearLayout;


        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            view = inflater.inflate(R.layout.spell_list_fragment,container,false);

            return view;
        }

}
