package com.mime.minefront;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Display extends Canvas {
    public static final int  WIDTH = 800;
    public static final int HEIGHT = 600;

    public static void main(String[] args){
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setVisible(true);

    }
}
