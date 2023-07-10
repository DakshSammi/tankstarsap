package com.mygdx.game1.windows;

public class weapon {
    private int damage;
    private float range;
    private int power;
    private int angle;
    private float x;
    private float y;


    public weapon(int damage,int range){
        this.damage = damage;
        this.range = range;
    }

    public void fire(int Power,int Angle,float X,float Y){


    }
    /*public float getFinalpos(){
        return 1;
    }*/
    public float getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }



    public void setDamage(int damage) {
        this.damage = damage;
    }



    public void setRange(float range) {
        this.range = range;
    }





}
