package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;

public class KeyPiano{
    private Vector2 position;
    private Texture keyImg,keyImg2;

    private Boolean touched;
    Random random = new Random();
    public KeyPiano(int x, int y ) {

        position = new Vector2(x,y);
        keyImg = new Texture("key.jpg");
        keyImg2= new Texture("touch.jpg");
        touched = false;

    }

    public Boolean getStatus() {
        return !touched;
    }

    public void touched(){
        touched = true;
    }
    public void untouch(){
        touched = false;
    }

    public Texture getKeyImg() {
        if(touched) {
            return keyImg2;
        }
        else{
            return keyImg;
        }
    }

    public Vector2 getPosition() {
        return position;
    }

    public void move(int tileSpeed){
        position.y += tileSpeed;
        if(position.y >= 1000){
            position.y = -250;
            this.untouch();
            int randX = random.nextInt(3);
            position.x = randX*200;
        }
    }
}



