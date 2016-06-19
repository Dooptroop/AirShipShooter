package com.mrdupree.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Matrix4;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Ship ship1;

	//Android HW stuff
//	boolean available = Gdx.input.isPeripheralAvailable(Input.Peripheral.Accelerometer);
//	int orientation;
//	float accelX = Gdx.input.getAccelerometerX();
//	float accelY = Gdx.input.getAccelerometerY();
//	float accelZ = Gdx.input.getAccelerometerZ();
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("starter_ship.png");
		ship1 = new Ship(img,0,0);
	}

	@Override
	public void render () {


		//Do The Drawing
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		ship1.render(batch);
		batch.end();
	}
}
