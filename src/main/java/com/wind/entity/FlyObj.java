package com.wind.entity;

import java.awt.*;

/**
 * 所有飞行对象抽象类
 * @author wind
 */
public abstract class FlyObj {
    /**
     * 对象背景图片
     */
    protected Image image;

    /**
     * 图片宽度
     */
    protected int width;

    /**
     * 图片高度
     */
    protected int height;

    /**
     * 横坐标
     */
    protected int x;

    /**
     * 纵坐标
     */
    protected int y;

    public FlyObj() {
    }

    public FlyObj(Image image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    public FlyObj(Image image, int width, int height, int x, int y) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * 飞行物移动
     * @param x
     * @param y
     */
    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }
}
