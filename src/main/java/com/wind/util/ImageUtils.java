package com.wind.util;

import javax.swing.*;
import java.awt.*;

/**
 * image读取工具类
 * @author wind
 */
public class ImageUtils {

    /**
     * 获取Image资源图片对象
     * @param path 以/开始
     * @return
     */
    public static Image getImage(String path){
        return new ImageIcon(ImageUtils.class.getResource(path)).getImage();
    }
}
