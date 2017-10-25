package com.wind.ui;

import com.wind.entity.Hero;
import com.wind.util.Const;
import com.wind.util.GameStatus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 游戏界面主面板
 * @author wind
 */
public class MainPanel extends JPanel{

    private GameStatus gameStatus;
    /**
     * 英雄机对象
     */
    private Hero hero;

    public MainPanel() {
        init();
    }

    /**
     * 初始化飞行物
     */
    public void init(){
        gameStatus = GameStatus.START;
        hero = new Hero(Const.HERO_ONE, 97, 124, 150 ,400);
    }

    /**
     * 开始游戏
     */
    public void action(){
        listen();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                hero.setImage(hero.getImage() == Const.HERO_ONE ? Const.HERO_SEC : Const.HERO_ONE);
                repaint();
            }
        }, 10, 10);
        // 10 ms
    }

    /**
     * 事件监听
     */
    public void listen(){
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setGameStatus(GameStatus.RUNNING);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setGameStatus(GameStatus.PAUSE);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println(x + "," + y);
                /*hero.setX(x);
                hero.setY(y);
                repaint();*/
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(Const.BACKGROUND, 0, 0, null);
        paintStatus(g);
        paintHero(g);
    }

    /**
     * 绘制英雄机
     * @param g
     */
    public void paintHero(Graphics g){
        g.drawImage(hero.getImage(), hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), null);
    }

    /**
     * 绘制游戏状态
     * @param g
     */
    public void paintStatus(Graphics g){
        switch (gameStatus){
            case START:
                g.drawImage(Const.START, 0, 0, null);
                break;
            case PAUSE:
                g.drawImage(Const.PAUSE, 0, 0, null);
                break;
            case RUNNING:
                break;
            case GAME_OVER:
                g.drawImage(Const.GAME_OVER, 0, 0, null);
                break;
            default:
                break;
        }
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
        this.repaint();
    }
}
