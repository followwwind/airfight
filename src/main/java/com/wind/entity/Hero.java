package com.wind.entity;

import java.awt.*;

/**
 * 英雄机
 * @author wind
 */
public class Hero extends FlyObj{
    
    public Hero() {
    }

    public Hero(Image image, int width, int height, int x, int y) {
        super(image, width, height, x, y);
    }

    /**
     * 英雄机移动
     * @param x
     * @param y
     */
    public void moveTo(int x, int y){
        this.x = x - width/2;
        this.y = y - height/2;
    }
}
