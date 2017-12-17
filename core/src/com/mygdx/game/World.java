package com.mygdx.game;


import java.util.Random;

public class World {
    Random randx = new Random();
    private KeyPiano keyPiano1,keyPiano2,keyPiano3,keyPiano4,keyPiano5;
    private TeleportGame teleportGame;
    World(TeleportGame teleportGame){
        this.teleportGame = teleportGame;

        keyPiano1 = new KeyPiano(200*randx.nextInt(3),-250);
        keyPiano2 = new KeyPiano(200*randx.nextInt(3),-500);
        keyPiano3 = new KeyPiano(200*randx.nextInt(3),-750);
        keyPiano4 = new KeyPiano(200*randx.nextInt(3),-1000);
        keyPiano5 = new KeyPiano(200*randx.nextInt(3),-1250);

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
