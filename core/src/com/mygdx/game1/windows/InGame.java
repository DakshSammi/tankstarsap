package com.mygdx.game1.windows;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game1.TankStars;

public class InGame implements Screen {
    public static final float dist = 50;
    private Texture img;
    private Texture tnk;
    private Texture pause;
    private Texture terr;
    private weapon bullet = new weapon(100, 500);
    private Texture b1;
    private TextureRegion bgT;
    float x;
    float y;
    final TankStars g1;
    Music izl;
    public InGame(final TankStars g1, Texture t){
        this.g1 = g1;
        img = new Texture(Gdx.files.internal("ingame_menu_1.jpg"));
        bgT = new TextureRegion(img, 0, 0, 1056, 593);
        tnk = t;
        pause = new Texture("pauser.png");
        terr = new Texture("terrain1 1.png");
        b1 = new Texture("bullet1-.png");
        izl = Gdx.audio.newMusic(Gdx.files.internal("ingame.mp3"));
    }
    @Override
    public void show() {
        izl.play();
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        g1.batch.begin();
        g1.batch.draw(bgT,0,0,1600,900);
        g1.batch.draw(tnk, x, y=200, 150, 100);
        g1.batch.draw(terr,0,0,1600,250);
        g1.batch.draw(b1,700,250,50,20);
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x += dist * Gdx.graphics.getDeltaTime();
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            x -= dist * Gdx.graphics.getDeltaTime();
        }
        g1.batch.draw(pause, 0, 750,300,150);
        if (Gdx.input.isTouched() && Gdx.input.getX() >= 0 && Gdx.input.getX() < 300 && Gdx.input.getY() > 0 && Gdx.input.getY() <= 150){
            g1.setScreen(new Pausemenu(g1,tnk));//SAVED GAMES
            dispose();
        }
        g1.batch.end();
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
        izl.dispose();
    }
}
