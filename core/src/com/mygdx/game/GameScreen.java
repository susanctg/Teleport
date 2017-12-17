package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
    private TeleportGame teleportGame;
    private Texture keyImg;
    public GameScreen(TeleportGame teleportGame) {
        this.teleportGame = teleportGame;
        keyImg = new Texture("key.jpg");
    }
    @Override
    public void render(float delta) {
        SpriteBatch batch = teleportGame.batch;
        batch.begin();
        batch.draw(keyImg, 0, 0);
        batch.end();
    }
}