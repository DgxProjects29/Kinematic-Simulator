package sketch;

import processing.core.PApplet;

public class ProcessingSketch extends PApplet{
    
    int x = 10;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        background(0);
        fill(255);
        circle(width / 2, height / 2, 50);
    }

    @Override
    public void draw() {
        background(0);
        circle(x, height / 2, 50);
        x += 10;
        delay(100);
    }

    public void run() {
        String[] processingArgs = { ProcessingSketch.class.getName() };
        PApplet.runSketch(processingArgs, this);
    }
}