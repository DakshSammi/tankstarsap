package com.mygdx.game1.windows;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game1.TankStars;

public class Pausemenu implements Screen {
    //resume, save, exit

    final TankStars g3;
    private Texture ResumeAct;
    private Texture ResumeInact;
    private Texture saveGameAct;
    private Texture saveGameInact;
    private Texture exitAct;
    private Texture exitInact;
    private Texture tnk;
    private TextureRegion bgT;
    private static final int ex_wid = 400;
    private static final int ex_hei = 150;
    private static final int lg_wid = 400;
    private static final int lg_hei = 150;
    private static final int ng_wid = 400;
    private static final int ng_hei = 150;

    public Pausemenu(final TankStars g3, Texture t) {
        this.g3 = g3;
        Texture bgimj = new Texture(Gdx.files.internal("pause_menu_1.jpg"));
        bgT = new TextureRegion(bgimj, 0, 0, 1070, 601);
        tnk = t;
        ResumeAct = new Texture("resume1.png");
        ResumeInact = new Texture("resume2.png");
        saveGameAct = new Texture("save_1.png");
        saveGameInact = new Texture("save_2.png");
        exitAct = new Texture("exit_nn.png");
        exitInact = new Texture("ea1.png");
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        g3.batch.begin();
        g3.batch.draw(bgT,0,0,1600,900);
        if (Gdx.input.getX() < 1000 && Gdx.input.getX() > 600 && Gdx.input.getY() < 740 && Gdx.input.getY() > 200) {
            g3.batch.draw(ResumeAct, 600, 550, ng_wid, ng_hei);
            g3.batch.draw(saveGameAct, 600, 350, lg_wid, lg_hei);
            g3.batch.draw(exitAct, 600, 150, ex_wid, ex_hei);
        }
        else {
            g3.batch.draw(ResumeInact, 600, 550, ng_wid, ng_hei);
            g3.batch.draw(saveGameInact, 600, 350, lg_wid, lg_hei);
            g3.batch.draw(exitInact, 600, 150, ex_wid, ex_hei);
        }
        if (Gdx.input.isTouched() && Gdx.input.getX() >= 600 && Gdx.input.getX() < 1000 && Gdx.input.getY() > 200 && Gdx.input.getY() <= 325) {
            g3.setScreen(new InGame(g3,tnk));//RESUME
            dispose();
        }
        else if (Gdx.input.isTouched() && Gdx.input.getX() >= 600 && Gdx.input.getX() < 1000 && Gdx.input.getY() > 420 && Gdx.input.getY() <= 525) {
            g3.setScreen(new SavedGames(g3));//SAVE GAME
            dispose();
        }
        else if (Gdx.input.isTouched() && Gdx.input.getX() >= 600 && Gdx.input.getX() < 1000 && Gdx.input.getY() > 605 && Gdx.input.getY() <= 730) {
            g3.setScreen(new MainMenu(g3));//EXIT
            dispose();
        }
        g3.batch.end();
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
