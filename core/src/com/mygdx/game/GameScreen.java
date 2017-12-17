package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
    private TeleportGame teleportGame;

    private int minScoreLine = 750-125;
    private int maxScoreLine = 1000-125;
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


    }
    private void update(float delta) {
        keyPiano1.move(world.getTileSpeed());
        keyPiano2.move(world.getTileSpeed());
        keyPiano3.move(world.getTileSpeed());
        keyPiano4.move(world.getTileSpeed());
        keyPiano5.move(world.getTileSpeed());
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            if((keyPiano1.getPosition().y >= minScoreLine& keyPiano1.getPosition().y<maxScoreLine) & keyPiano1.getPosition().x==0){
                world.increaseScore();
                keyPiano1.touched();
            }
            if((keyPiano2.getPosition().y >= minScoreLine& keyPiano2.getPosition().y<maxScoreLine) & keyPiano2.getPosition().x==0){
                world.increaseScore();
                keyPiano2.touched();
            }
            if((keyPiano3.getPosition().y >= minScoreLine& keyPiano3.getPosition().y<maxScoreLine) & keyPiano3.getPosition().x==0){
                world.increaseScore();
                keyPiano3.touched();
            }
            if((keyPiano4.getPosition().y >= minScoreLine& keyPiano4.getPosition().y<maxScoreLine) & keyPiano4.getPosition().x==0){
                world.increaseScore();
                keyPiano4.touched();
            }
            if((keyPiano5.getPosition().y >= minScoreLine& keyPiano5.getPosition().y<maxScoreLine) & keyPiano5.getPosition().x==0){
                world.increaseScore();
                keyPiano5.touched();
            }
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            if((keyPiano1.getPosition().y >= minScoreLine& keyPiano1.getPosition().y<maxScoreLine) & keyPiano1.getPosition().x==200){
                world.increaseScore();
                keyPiano1.touched();
            }
            if((keyPiano2.getPosition().y >= minScoreLine& keyPiano2.getPosition().y<maxScoreLine) & keyPiano2.getPosition().x==200){
                world.increaseScore();
                keyPiano2.touched();
            }
            if((keyPiano3.getPosition().y >= minScoreLine& keyPiano3.getPosition().y<maxScoreLine) & keyPiano3.getPosition().x==200){
                world.increaseScore();
                keyPiano3.touched();
            }
            if((keyPiano4.getPosition().y >= minScoreLine& keyPiano4.getPosition().y<maxScoreLine) & keyPiano4.getPosition().x==200){
                world.increaseScore();
                keyPiano4.touched();
            }
            if((keyPiano5.getPosition().y >= minScoreLine& keyPiano5.getPosition().y<maxScoreLine) & keyPiano5.getPosition().x==200){
                world.increaseScore();
                keyPiano5.touched();
            }
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            if((keyPiano1.getPosition().y >= minScoreLine& keyPiano1.getPosition().y<maxScoreLine) & keyPiano1.getPosition().x==400){
                world.increaseScore();
                keyPiano1.touched();
            }
            if((keyPiano2.getPosition().y >= minScoreLine& keyPiano2.getPosition().y<maxScoreLine) & keyPiano2.getPosition().x==400){
                world.increaseScore();
                keyPiano2.touched();
            }
            if((keyPiano3.getPosition().y >= minScoreLine& keyPiano3.getPosition().y<maxScoreLine) & keyPiano3.getPosition().x==400){
                world.increaseScore();
                keyPiano3.touched();
            }
            if((keyPiano4.getPosition().y >= minScoreLine& keyPiano4.getPosition().y<maxScoreLine) & keyPiano4.getPosition().x==400){
                world.increaseScore();
                keyPiano4.touched();
            }
            if((keyPiano5.getPosition().y >= minScoreLine& keyPiano5.getPosition().y<maxScoreLine) & keyPiano5.getPosition().x==400){
                world.increaseScore();
                keyPiano5.touched();
            }
        }

    }
    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
    }

}