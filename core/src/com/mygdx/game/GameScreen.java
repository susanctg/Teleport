package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter {
    private TeleportGame teleportGame;

    public GameScreen(TeleportGame teleportGame) {
        this.teleportGame = teleportGame;
    }
}