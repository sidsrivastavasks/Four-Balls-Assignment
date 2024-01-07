package org.example;

import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int xAxis = 1;

    public static void main(String[] args){
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
        xAxis++;
    }

    public void drawCircle() {
        for (int circleNumber = 1; circleNumber <=4 ; circleNumber++) {
            ellipse(xAxis * circleNumber, HEIGHT * (circleNumber / 5), DIAMETER, DIAMETER);
        }
    }
}
