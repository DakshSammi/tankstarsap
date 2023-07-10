package com.mygdx.game1.windows;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game1.TankStars;

import java.awt.*;

public class MainMenu implements Screen {
    final TankStars g2;
    private Texture newGameAct;
    private Texture newInact;
    private Texture loadGameAct;
    private Texture loadGameInact;
    private Texture exitAct;
    private Texture exitInact;
    private Texture bgimage;
    private static final int ex_wid = 1200;
    private static final int ex_hei = 1000;
    private static final int lg_wid = 1200;
    private static final int lg_hei = 1000;
    private static final int ng_wid = 1200;
    private static final int ng_hei = 1000;
    //OrthographicCamera cam;
    Music gzl;
    private TextureRegion bgT;
    public MainMenu(final TankStars g2) {
        this.g2 = g2;
        bgimage = new Texture(Gdx.files.internal("main_menu1.jpg"));
        bgT = new TextureRegion(bgimage, 0, 0, 1283, 720);
        newGameAct = new Texture("new_game_act1.png");
        newInact = new Texture("new_game_act.png");
        loadGameAct = new Texture("load_game_act1.png");
        loadGameInact = new Texture("load_game_inact.png");
        exitAct = new Texture("exitAct.png");
        exitInact = new Texture("exit_Inact.png");
        gzl = Gdx.audio.newMusic(Gdx.files.internal("tankbook.mp3"));
    }
    @Override
    public void show() {

        gzl.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        //cam.update();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //g2.batch.setProjectionMatrix(cam.combined);
        g2.batch.begin();
        g2.batch.draw(bgT,0,0,1600,900);
        if (Gdx.input.getX() < 1400 && Gdx.input.getX() > 200 && Gdx.input.getY() < 750 && Gdx.input.getY() > 15) {
            g2.batch.draw(newGameAct, 200, 0, ng_wid, ng_hei);
            g2.batch.draw(loadGameAct, 200, -100, lg_wid, lg_hei);
            g2.batch.draw(exitAct, 200, -200, ex_wid, ex_hei);
        }
        else {
            g2.batch.draw(newInact, 200, 0, ng_wid, ng_hei);
            g2.batch.draw(loadGameInact, 200, -100, lg_wid, lg_hei);
            g2.batch.draw(exitInact, 200, -200, ex_wid, ex_hei);
        }
        if (Gdx.input.isTouched() && Gdx.input.getX() >= 200 && Gdx.input.getX() < 1400 && Gdx.input.getY() > 350 && Gdx.input.getY() <= 460) {
            g2.setScreen(new SavedGames(g2));//SAVED GAMES
            dispose();
        }
        else if (Gdx.input.isTouched() && Gdx.input.getX() >= 200 && Gdx.input.getX() < 1400 && Gdx.input.getY() > 50 && Gdx.input.getY() <= 150){
            g2.setScreen(new tankMenu(g2));//NEW GAME
            dispose();
        }
        else if (Gdx.input.isTouched() && Gdx.input.getX() >= 200 && Gdx.input.getX() < 1400 && Gdx.input.getY() > 670 && Gdx.input.getY() <= 760){
            g2.setScreen(new exit_temp(g2));//EXIT
            dispose();
        }
        g2.batch.end();
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
        gzl.dispose();
    }
}
