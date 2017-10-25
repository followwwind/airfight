package com.wind.util;

import java.awt.*;

/**
 * 常量定义
 * @author wind
 */
public interface Const {
    /**
     * app名称
     */
    String APP_NAME = "airfight";

    /**
     * ui界面宽度
     */
    int WIDTH = 400;

    /**
     * ui界面高度
     */
    int HEIGHT = 654;

    /**
     * 敌机图片
     */
    Image AIRPLANE = ImageUtils.getImage("/image/airplane.png");
    /**
     * 小蜜蜂
     */
    Image BEE = ImageUtils.getImage("/image/bee.png");

    /**
     * 子弹
     */
    Image BULLET = ImageUtils.getImage("/image/bullet.png");

    /**
     * 开始
     */
    Image START = ImageUtils.getImage("/image/start.png");
    /**
     * 暂停
     */
    Image PAUSE = ImageUtils.getImage("/image/pause.png");

    /**
     * 英雄机1
     */
    Image HERO_ONE = ImageUtils.getImage("/image/hero0.png");

    /**
     * 英雄机2
     */
    Image HERO_SEC = ImageUtils.getImage("/image/hero1.png");

    /**
     * 背景图片
     */
    Image BACKGROUND = ImageUtils.getImage("/image/background.png");

    /**
     * 游戏结束
     */
    Image GAME_OVER = ImageUtils.getImage("/image/gameover.png");

}
