package com.mrdupree.game;


import com.badlogic.gdx.graphics.Texture;

/**
 * Created by mdupree on 19/06/16.
 */
public class ShipFire {

    private Texture image;
    private int startxpos, xpos, ypos, width, height;

    public ShipFire(Texture image, int startxpos, int xpos, int ypos) {
        this.image = image;
        this.startxpos = startxpos;
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    public Texture getImage() {
        return image;
    }

    public void setImage(Texture image) {
        this.image = image;
    }

    public int getStartxpos() {
        return startxpos;
    }

    public void setStartxpos(int startxpos) {
        this.startxpos = startxpos;
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
}
