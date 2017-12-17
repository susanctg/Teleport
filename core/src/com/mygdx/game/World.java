package com.mygdx.game;


import java.util.Random;

public class World {
    Random randx = new Random();
    private KeyPiano keyPiano1,keyPiano2,keyPiano3,keyPiano4,keyPiano5;
    private TeleportGame teleportGame;
    private int tileSpeed = 5;
    private int score = 0;
    private int state = 1;
    World(TeleportGame teleportGame){
        this.teleportGame = teleportGame;

        keyPiano1 = new KeyPiano(200*randx.nextInt(3),-250);
        keyPiano2 = new KeyPiano(200*randx.nextInt(3),-500);
        keyPiano3 = new KeyPiano(200*randx.nextInt(3),-750);
        keyPiano4 = new KeyPiano(200*randx.nextInt(3),-1000);
        keyPiano5 = new KeyPiano(200*randx.nextInt(3),-1250);

    }
    public int getState(){
        return state;
    }
    void changeState(int n){
        state = n;
    }
    void increaseScore(){
        score += 1;
    }
    public int getScore(){
        return score;
    }
    void increaseSpeed(){
        tileSpeed += 1;
    }

    public int getTileSpeed(){
        return tileSpeed;
    }

    KeyPiano getKeyPiano1() {
        return keyPiano1;
    }
    KeyPiano getKeyPiano2() {
        return keyPiano2;
    }
    KeyPiano getKeyPiano3() {
        return keyPiano3;
    }
    KeyPiano getKeyPiano4() {
        return keyPiano4;
    }
    KeyPiano getKeyPiano5() {
        return keyPiano5;
    }




}
