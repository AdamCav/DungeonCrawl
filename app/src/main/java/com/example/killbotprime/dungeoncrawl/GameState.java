package com.example.killbotprime.dungeoncrawl;

import com.example.killbotprime.dungeoncrawl.Locations.Location;

/**
 * All data necessary to a 'saveable' game state. This is what should persist between sessions.
 */
public class GameState {
    Party party;
    Location location;
}
