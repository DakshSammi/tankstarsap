package com.mygdx.game1.windows;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game1.TankStars;

public class SavedGames implements Screen {
    final TankStars g9;
    private Texture bgImage;
    private TextureRegion bgT;
    private Texture bicon;
    Music szl;
    public SavedGames(final TankStars g9)
    {
        this.g9 = g9;
        bgImage = new Texture(Gdx.files.internal("svgam.jpg"));
        bgT = new TextureRegion(bgImage, 0, 0, 1026, 577);
        bicon = new Texture(Gdx.files.internal("sav_exit.png"));
        szl = Gdx.audio.newMusic(Gdx.files.internal("password-infinity-123276.mp3"));
    }

    @Override
    public void show() {
        szl.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        g9.batch.begin();
        g9.batch.draw(bgT,0,0,1600,900);
        g9.batch.draw(bicon,1400,20,200,100);
        if (Gdx.input.isTouched() && Gdx.input.getX() >= 1400 && Gdx.input.getX() < 1600 && Gdx.input.getY() > 800 && Gdx.input.getY() <= 900) {
            g9.setScreen(new MainMenu(g9));//MAIN MENU
            dispose();
        }
        g9.batch.end();
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
        szl.dispose();
    }
}
