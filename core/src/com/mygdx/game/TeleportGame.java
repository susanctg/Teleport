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
	//int x = 0;
	//int y = 0;
	int y1 = -250;
	int y2 = 0;
	int y3 = -500;
	
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
		
		moveup(0,y1,1);
		moveup(200,y2,2);
		moveup(400,y3,3);
		if(delay > 30+delay_update) {
			y1+=250;
			y2+=250;
			y3+=250;
			delay_update = delay;
		}
				
		delay += 1;
		
		batch.end();
	}
	public void moveup(int x,int y,int block) {
		if(y>=0) {
			batch.draw(piano_key,x,y);
		}
		if(y==1000) {
			if(block ==1) {
				y1=0;
			}
			else if(block ==2) {
				y2=0;		
			}
			else if(block ==3) {
				y3=0;
			}
		}
	}
	/*
	public void moveup(int x,int y,int speed) {
		int update_y = y+move_y;
		batch.draw(piano_key,x,update_y);
		if(update_y<1000 & delay > speed+delay_update) {
			move_y += 250;
			delay_update = delay;
		}
		else if(update_y == 1000) {
			move_y =0-y;
		}
	
		delay += 1;
	}
	*/
	
	@Override
	public void dispose () {
		batch.dispose();
		piano_key.dispose();
	}
}