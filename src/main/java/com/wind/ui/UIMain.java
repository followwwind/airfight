package com.wind.ui;

import com.wind.util.Const;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * ui主线程
 * @author wind
 */
public class UIMain {

    private JFrame frame;

    public void init(){
        frame = new JFrame(Const.APP_NAME);
        frame.setSize(Const.WIDTH, Const.HEIGHT);
        MainPanel mainPanel = new MainPanel();
        frame.add(mainPanel);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(Const.AIRPLANE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.pack();
        mainPanel.action();
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(() ->{
                new UIMain().init();
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
