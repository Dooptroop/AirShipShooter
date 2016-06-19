package com.mrdupree.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Created by mdupree on 19/06/16.
 */
public class InputController {
    public InputController() {
    }
    public int checkControlX(int speed){
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            return +speed;
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            return -speed;
        }
        return 0;
    }

    public int checkControlY(int speed){
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            return +speed;
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            return -speed;
        }
        return 0;
    }

    public boolean checkControlFire(){
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            System.out.println("FIRE!");
            return true;
        }
        return false;
    }
}
