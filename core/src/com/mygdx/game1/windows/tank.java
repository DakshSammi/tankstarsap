package com.mygdx.game1.windows;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class tank {
    private float x;
    private float y;
    private int fuel;
    private int health;
    private HashMap<weapon,Integer> weaplist = new HashMap<>();
    private int angle;
    private int power;


    public float getX() {
        return x;}

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getFuel() {
        return fuel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getAngle() {
        return angle;
    }

    public int getPower() {
        return power;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public  void move(){

    }

    public void destroy(){

    }

    public void fire(weapon w){

    }

    public void getWeapon(weapon w){

    }

    public void addWeapon(weapon w){

    }


}
