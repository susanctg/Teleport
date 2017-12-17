package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
    private TeleportGame teleportGame;
    private Texture keyImg;
    //Vector2 pos;
    World world;
    WorldRenderer worldRenderer;
    KeyPiano keyPiano1,keyPiano2,keyPiano3,keyPiano4,keyPiano5;
    public GameScreen(TeleportGame teleportGame) {
        this.teleportGame = teleportGame;
        world = new World(teleportGame);
        keyPiano1 = world.getKeyPiano1();
        keyPiano2 = world.getKeyPiano2();
        keyPiano3 = world.getKeyPiano3();
        keyPiano4 = world.getKeyPiano4();
        keyPiano5 = world.getKeyPiano5();
        worldRenderer = new WorldRenderer(teleportGame , world);
        keyImg = new Texture("key.jpg");

    }
    private void update(float delta) {
        keyPiano1.move();
        keyPiano2.move();
        keyPiano3.move();
        keyPiano4.move();
        keyPiano5.move();
    }
    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
    }

}