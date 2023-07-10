package com.mygdx.game1;
import com.mygdx.game1.TankStars;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(180);
		config.setTitle("TANK STARS");
		config.setWindowedMode(TankStars.width, TankStars.height);
		config.setResizable(false);
		new Lwjgl3Application(new TankStars(), config);
	}
}
