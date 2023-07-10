package com.mygdx.game1.windows;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game1.TankStars;

public class exit_temp implements Screen {
    final TankStars gL;
    private Texture desk_i;
    private Texture bgimage;
    private TextureRegion bgT;
    public exit_temp(TankStars gL) {
        this.gL = gL;
        desk_i = new Texture("desktop_icon.jpeg");
        bgimage = new Texture(Gdx.files.internal("exit_tmp1.jpg"));
        bgT = new TextureRegion(bgimage, 0, 0, 827, 467);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gL.batch.begin();
        gL.batch.draw(bgT,0,0,1600,900);
        gL.batch.draw(desk_i, 100, 50, 200, 100);
        if (Gdx.input.isTouched() && Gdx.input.getX() >= 100 && Gdx.input.getX() < 300 && Gdx.input.getY() > 750 && Gdx.input.getY() <= 850) {
            gL.setScreen(new MainMenu(gL));//OPEN THE GAME FROM DESKTOP ICON
            dispose();
        }
        gL.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
