package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	private TeleportGame teleportGame;
	private Texture pianoImg;
    private int x;
    private int y;
    private PianoKey pianoKey;
    public GameScreen(TeleportGame teleportGame) {
        this.teleportGame = teleportGame;
        pianoImg = new Texture("key.jpg");
        pianoKey = new PianoKey(0,0);
       
       
    }
    
    @Override
    public void render(float delta) {
    	update(delta);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        SpriteBatch batch = teleportGame.batch;
        
        batch.begin();
        Vector2 pos = pianoKey.getPosition();
        batch.draw(pianoImg,pos.x,pos.y);
        
        batch.end();
    }
    
    private void update(float delta) {
    	Vector2 pos = pianoKey.getPosition();
    	pos.y+=5;
    	/*if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += 10;
        }*/
        
    }
    
}