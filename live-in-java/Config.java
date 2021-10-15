package com.max.idea;

import java.awt.*;

public class Config {

    public static final int SIZE = 4;
    public static final int WIDTH = 190;
    public static final int HEIGHT = 180;
    public static final int SLEEPMS = 5;

    public static Color getColor(Status status){

        switch (status){
            default -> {
                return Color.black;
            }
            case NONE -> {
                return Color.BLACK;
            }
            case BORN -> {
                return Color.GREEN;
            }
            case LIVE -> {
                return Color.WHITE;
            }
            case DIED -> {
                return Color.BLUE;
            }
        }

    }
}
