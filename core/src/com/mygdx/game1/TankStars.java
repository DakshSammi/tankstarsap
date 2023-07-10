package com.mygdx.game1;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game1.windows.MainMenu;
import com.mygdx.game1.windows.Pausemenu;
import com.mygdx.game1.windows.tankMenu;

public class TankStars extends Game {
	public static final int width = 1600;
	public static final int height = 900;
	public SpriteBatch batch;
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainMenu(this));
		//this.setScreen(new tank2(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {

	}
}
