package sketch;

import processing.core.PApplet;
import vectors.Acceleration;
import vectors.Position;
import vectors.Velocity;
import main.SketchEvents;

public class ProcessingSketch extends PApplet{
    
    private SketchEvents sketchEvents;

    private int MAX_BALL_SIZE = 5;
    private Ball[] balls;
    private int ballIndex;

    //Flags
    public boolean isAskingForBallPosition = false;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        background(0);
        initSketch();
    }

    private void initSketch(){
        balls = new Ball[MAX_BALL_SIZE];
        ballIndex = 0;
    }

    @Override
    public void draw() {
        background(0);
        previewBall();
    }

    @Override
    public void mousePressed() {
        
        if (isAskingForBallPosition){
            sketchEvents.sendBallPosition(new Position(mouseX, mouseY));
            isAskingForBallPosition = false;
        }
    }

    private void previewBall(){

        if (isAskingForBallPosition){
            Ball.previewBall(this, mouseX, mouseY);
        }
    }

    public void createBall(Position ballPosition, Velocity ballVelocity,
        Acceleration ballAcceleration){
        
        if (ballIndex < MAX_BALL_SIZE){
            balls[ballIndex] = new Ball(this, ballPosition, ballVelocity, ballAcceleration);
            ballIndex ++;    
        }else{
            //Send error message to interface
        }
    }

    public void run(SketchEvents sketchEvents) {
        String[] processingArgs = { ProcessingSketch.class.getName() };
        PApplet.runSketch(processingArgs, this);
        this.sketchEvents = sketchEvents;
    }
}