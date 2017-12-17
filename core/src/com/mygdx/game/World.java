package com.mygdx.game;


public class World {
    private KeyPiano keyPiano1,keyPiano2,keyPiano3,keyPiano4;
    private TeleportGame teleportGame;
    World(TeleportGame teleportGame){
        this.teleportGame = teleportGame;
        keyPiano1 = new KeyPiano(0,-250);
        keyPiano2 = new KeyPiano(200,-500);
        keyPiano3 = new KeyPiano(400,-750);
        keyPiano4 = new KeyPiano(0,-1000);

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


}
