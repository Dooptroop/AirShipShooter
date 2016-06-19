package com.mrdupree.game;

import java.awt.*;

/**
 * Created by mdupree on 19/06/16.
 */
public class Ship {

    private Image ShipImage;
    private int xpos, ypos, width, height;


    public Ship(Image shipImage, int xpos, int ypos, int width, int height) {
        ShipImage = shipImage;
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = width;
        this.height = height;
    }

    public Image getShipImage() {
        return ShipImage;
    }

    public void setShipImage(Image shipImage) {
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
}
