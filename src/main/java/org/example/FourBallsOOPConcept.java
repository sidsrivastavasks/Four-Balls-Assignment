package org.example;

import processing.core.PApplet;

class Ball {
    int HEIGHT = 480;
    int SPEED;
    final int DIAMETER = 10;
    int WIDTH = 640;
    int position=1;

    Ball(int SPEED){
        this.SPEED = SPEED;
    }

    public void drawBall(){
        PApplet pInst = new PApplet();
        pInst.ellipse(WIDTH * position, (HEIGHT * (position/5)), DIAMETER, DIAMETER);
    }

    public void moveBall(){
        position += SPEED;
    }
}

public class FourBallsOOPConcept extends PApplet {
    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;
    public static final int NUMBER_OF_BALLS = 4;
    Ball[] arrOfBalls;

    public static void main(String[] args) {
        PApplet.main("FourBallsOOPConcept",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        arrOfBalls = new Ball[4];
        for (int i=0; i<4; i++){
            arrOfBalls[i] = new Ball(i+1);
        }
    }

    @Override
    public void draw() {
        for (int i=0; i< NUMBER_OF_BALLS; i++){
            arrOfBalls[i].drawBall();
            arrOfBalls[i].moveBall();
        }
    }
}
