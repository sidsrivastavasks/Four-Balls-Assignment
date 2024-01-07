package org.example;
import processing.core.PApplet;

class TryProcessing extends PApplet{
    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(640, 480);
    }

    @Override
    public void setup(){
        System.out.println("Printed from the setup method");
        ellipse(320, 240, 100, 100);
    }

    @Override
    public void draw(){
        paintWhite();
        ellipse(mouseX, mouseY, 100, 100);
    }

    public void paintWhite(){
        background(255);
    }
}