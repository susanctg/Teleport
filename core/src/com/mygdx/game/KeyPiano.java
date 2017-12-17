package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class KeyPiano{
    private Vector2 position;

    public KeyPiano(int x, int y) {
        position = new Vector2(x,y);
    }

    public Vector2 getPosition() {
        return position;
    }

    public void move(){
        position.y += 5;
        if(position.y >= 1000){
            //position.y = -250;
        }
    }
}



