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
    public boolean isRunning = false;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        frameRate(30);
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

        simulateKinematic();

        previewBall();
        previewBalls();
    }

    @Override
    public void mousePressed() {
        
        if (isAskingForBallPosition){
            sketchEvents.sendBallPosition(new Position(mouseX, mouseY));
            isAskingForBallPosition = false;
        }
    }

    private void simulateKinematic(){

        if (isRunning){
            for (int i = 0; i < ballIndex; i++) {
                Ball ball = balls[i];
                ball.onUpdate();
            }
        }
    }

    private void previewBall(){

        if (isAskingForBallPosition){
            Ball.previewBall(this, mouseX, mouseY);
        }
    }

    private void previewBalls(){
        if (!isRunning){
            for (int i = 0; i < ballIndex; i++) {
                Ball ball = balls[i];
                ball.drawBall();
            }
        }
    }

    public void createBall(Position ballPosition, Velocity ballVelocity,
        Acceleration ballAcceleration){
        
        if (ballIndex < MAX_BALL_SIZE){
            Ball newBall = new Ball(this, ballPosition, ballVelocity, ballAcceleration);
            balls[ballIndex] = newBall;
            ballIndex ++;
        }else{
            //Send error message to interface
        }
    }

    public void restartSketch(){
        initSketch();
        isRunning = false;
    }

    public void run(SketchEvents sketchEvents) {
        String[] processingArgs = { ProcessingSketch.class.getName() };
        PApplet.runSketch(processingArgs, this);
        this.sketchEvents = sketchEvents;
    }
}