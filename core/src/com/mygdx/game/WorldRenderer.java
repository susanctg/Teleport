package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class WorldRenderer {
    private World world;
    private TeleportGame teleportGame;
    private KeyPiano keyPiano1,keyPiano2,keyPiano3,keyPiano4,keyPiano5;
    private Texture scoreLineImg,startImg,overImg;
    private Batch batch;
    private Vector2 pos1,pos2,pos3,pos4,pos5;
    private BitmapFont font;


    Random randStripe = new Random();
    public WorldRenderer(TeleportGame teleportGame, World world) {
        this.teleportGame = teleportGame;
        batch = teleportGame.batch;
        this.world = world;

        keyPiano1 = world.getKeyPiano1();
        keyPiano2 = world.getKeyPiano2();
        keyPiano3 = world.getKeyPiano3();
        keyPiano4 = world.getKeyPiano4();
        keyPiano5 = world.getKeyPiano5();

        pos1 = keyPiano1.getPosition();
        pos2 = keyPiano2.getPosition();
        pos3 = keyPiano3.getPosition();
        pos4 = keyPiano4.getPosition();
        pos5 = keyPiano5.getPosition();

        scoreLineImg = new Texture("scoreline.png");
        startImg = new Texture("start.jpg");
        overImg = new Texture("over.jpg");
        font = new BitmapFont();
    }

    public void render(float delta){

        SpriteBatch batch = teleportGame.batch;

        if(world.getState() == 1){
            batch.begin();
            batch.draw(startImg,0,0);
            batch.end();
        }
       if(world.getState() == 2) {
            batch.begin();

            batch.draw(keyPiano1.getKeyImg(), pos1.x, pos1.y);
            batch.draw(keyPiano2.getKeyImg(), pos2.x, pos2.y);
            batch.draw(keyPiano3.getKeyImg(), pos3.x, pos3.y);
            batch.draw(keyPiano4.getKeyImg(), pos4.x, pos4.y);
            batch.draw(keyPiano5.getKeyImg(), pos5.x, pos5.y);
            font.draw(batch, "" + world.getScore(), 300, 50);
            batch.draw(scoreLineImg,0,1000-125);
            batch.end();
        }
        if(world.getState() == 3){
            batch.begin();
            batch.draw(overImg,0,0);
            font.draw(batch,""+world.getScore(),315,428);
            batch.end();
        }



    }
}