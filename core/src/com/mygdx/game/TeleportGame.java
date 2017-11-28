package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.utils.Timer;

public class TeleportGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture piano_key;
	int x = 0;
	int y = 0;
	int move_y = 0;
	int delay = 1; //second
	int delay_update = 0;
	@Override
	public void create () {
		batch = new SpriteBatch();
		piano_key = new Texture("key.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		batch.draw(piano_key,x,y+move_y);
		if(move_y<=1000 & delay > 30+delay_update) {
			move_y += 250;
			delay_update = delay;
		}
	
		delay += 1;
		batch.end();
	}
	/*public void moveup(int x,int y) {
		batch.draw(piano_key,x,y+move_y);
		
		if(move_y<=1000){
			move_y += 250;
		}
	}*/
	
	
	@Override
	public void dispose () {
		batch.dispose();
		piano_key.dispose();
	}
}