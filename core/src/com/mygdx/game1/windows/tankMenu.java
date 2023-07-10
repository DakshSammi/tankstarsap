package com.mygdx.game1.windows;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game1.TankStars;

public class tankMenu implements Screen {
    final TankStars gT;
    private Texture tank1;
    private Texture tank2;
    private Texture tank3;
    private Texture bgimage;
    private TextureRegion bgT;
    Music tzl;
    private static final int ex_wid = 200;
    private static final int ex_hei = 100;
    private static final int lg_wid = 200;
    private static final int lg_hei = 100;
    private static final int ng_wid = 200;
    private static final int ng_hei = 200;

    public tankMenu(final TankStars gT) {
        this.gT = gT;
        bgimage = new Texture(Gdx.files.internal("tank_menu7.jpg"));
        bgT = new TextureRegion(bgimage, 0, 0, 1027, 578);
        tank1 = new Texture("abramsbe.png");
        tank2 = new Texture("frost.png");
        tank3 = new Texture("pumpki_n.png");
        tzl = Gdx.audio.newMusic(Gdx.files.internal("tankbook.mp3"));
    }


    @Override
    public void show() {
        tzl.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gT.batch.begin();
        gT.batch.draw(bgT,0,0,1600,900);
        gT.batch.draw(tank1, 155, 200, ng_wid, ng_hei);
        gT.batch.draw(tank2, 720, 330, lg_wid, lg_hei);
        gT.batch.draw(tank3, 1200, 200, ex_wid, ex_hei);
        if (Gdx.input.isTouched() && Gdx.input.getX() >= 155 && Gdx.input.getX() < 355 && Gdx.input.getY() > 540 && Gdx.input.getY() <= 650) {
            gT.setScreen(new InGame(gT, tank1));
            dispose();
        }
        else if (Gdx.input.isTouched() && Gdx.input.getX() >= 720 && Gdx.input.getX() < 920 && Gdx.input.getY() > 460 && Gdx.input.getY() <= 570) {
            gT.setScreen(new InGame(gT, tank2));//tank 2
            dispose();
        }
        else if (Gdx.input.isTouched() && Gdx.input.getX() >= 1200 && Gdx.input.getX() < 1400 && Gdx.input.getY() > 610 && Gdx.input.getY() <= 710) {
            gT.setScreen(new InGame(gT, tank3));//tank3
            dispose();
        }
        gT.batch.end();
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
        tzl.dispose();
    }

}
