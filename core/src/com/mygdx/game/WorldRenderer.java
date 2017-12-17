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
    private Texture keyImg,stripeImg,scoreLine;
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
        keyImg = new Texture("key.jpg");
        stripeImg = new Texture("g_stripe.jpg");
        scoreLine = new Texture("scoreline.jpg");
        font = new BitmapFont();
    }

    public void render(float delta){

        SpriteBatch batch = teleportGame.batch;
        batch.begin();
/*
        int randStripe1 = randStripe.nextInt(4);
        int randStripe2 = randStripe.nextInt(4);
        int randStripe3 = randStripe.nextInt(4);
        if(randStripe.nextInt(30)== 1){
            batch.draw(stripeImg,0,0);
        }
        if(randStripe.nextInt(30) == 1){
            batch.draw(stripeImg,200,0);
        }
        if(randStripe.nextInt(30) == 1){
            batch.draw(stripeImg,400,0);
        }
*/
        batch.draw(scoreLine,0,875);
        batch.draw(keyImg,pos1.x,pos1.y);
        batch.draw(keyImg,pos2.x,pos2.y);
        batch.draw(keyImg,pos3.x,pos3.y);
        batch.draw(keyImg,pos4.x,pos4.y);
        batch.draw(keyImg,pos5.x,pos5.y);
        font.draw(batch, "" + world.getScore(),300, 50);
        batch.end();

    }
}
