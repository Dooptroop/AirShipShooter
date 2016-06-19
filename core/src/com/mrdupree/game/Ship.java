package com.mrdupree.game;

import java.awt.*;

/**
 * Created by mdupree on 19/06/16.
 */

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ship {

    private Texture ShipImage;
    private int xpos;
    private int ypos;
    private int width;
    private int height;
    private int health, armor;
    private int weapon, weapon_dmg, firedXpos;
    InputController input;
    private boolean firing = false;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;


    public Ship(Texture shipImage, int xpos, int ypos) {
        ShipImage = shipImage;
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = ShipImage.getWidth();
        this.height = ShipImage.getHeight();
        this.setSpeed(1);
        this.input = new InputController();
        this.health = 10;
        this.armor = 0;
        this.weapon = 0;
        this.weapon_dmg = 2;
    }

    public Texture getShipImage() {
        return ShipImage;
    }

    public void setShipImage(Texture shipImage) {
        ShipImage = shipImage;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void render(Batch batch){

        this.setSpeed(3);//@todo for testing speed

        this.shipAdjust();
        this.fire(batch);

        batch.draw(this.getShipImage(), this.getXpos(), this.getYpos());

    }
    private void shipAdjust(){

        int shipXadjust = input.checkControlX(this.getSpeed());
        int shipYadjust = input.checkControlY(this.getSpeed());

        if( shipXadjust != 0 ) {
            this.setXpos(this.getXpos() + shipXadjust);
        }
        if( shipYadjust != 0 ) {
            this.setYpos(this.getYpos() + shipYadjust);
        }
    }

    private void fire(Batch batch){
        boolean fireTriggered = input.checkControlFire();
        this.firing = true;
        if(fireTriggered){
            Texture fireshot = new Texture("shotflare1.png");
            this.firedXpos = this.getXpos() + this.getWidth()/2;
            ShipFire shot = new ShipFire(
                    fireshot,
                    this.firedXpos,//tracks the position in ShipFire Class
                    this.firedXpos,
                    this.getYpos() + this.getHeight());
            shot.render(batch);
        }
        this.firing = false;
    }

    private boolean checkHit(Ship ship){
        if(this.xpos == ship.getXpos()){
            if(this.firedXpos == ship.getXpos()){
                if(this.firing){
                    System.out.println("hit");
                    return true;
                }
            }
        }
        return true;
    }
}
