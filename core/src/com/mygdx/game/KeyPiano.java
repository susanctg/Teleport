package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class KeyPiano{
    private Vector2 position;
    Random random = new Random();
    public KeyPiano(int x, int y) {
        position = new Vector2(x,y);
    }

    public Vector2 getPosition() {
        return position;
    }

    public void move(){
        position.y += 5;
        if(position.y >= 1000){
            position.y = -250;
            int randX = random.nextInt(3);
            position.x = randX*200;
        }
    }
}



