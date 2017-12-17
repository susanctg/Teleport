package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
    private World world;
    private TeleportGame teleportGame;
    private KeyPiano keyPiano1,keyPiano2,keyPiano3,keyPiano4;
    private Texture keyImg;
    private Batch batch;
    private Vector2 pos1,pos2,pos3,pos4;
    public WorldRenderer(TeleportGame teleportGame, World world) {
        this.teleportGame = teleportGame;
        batch = teleportGame.batch;

        this.world = world;
        keyPiano1 = world.getKeyPiano1();
        keyPiano2 = world.getKeyPiano2();
        keyPiano3 = world.getKeyPiano3();
        keyPiano4 = world.getKeyPiano4();

        pos1 = keyPiano1.getPosition();
        pos2 = keyPiano2.getPosition();
        pos3 = keyPiano3.getPosition();
        pos4 = keyPiano4.getPosition();
        keyImg = new Texture("key.jpg");

    }

    public void render(float delta){

        SpriteBatch batch = teleportGame.batch;
        batch.begin();

        batch.draw(keyImg,pos1.x,pos1.y);
        batch.draw(keyImg,pos2.x,pos2.y);
        batch.draw(keyImg,pos3.x,pos3.y);
        batch.draw(keyImg,pos4.x,pos4.y);

        batch.end();

    }
}
