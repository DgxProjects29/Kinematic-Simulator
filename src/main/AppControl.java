package main;

import interfaces.ToolInterface;
import sketch.ProcessingSketch;
import vectors.Acceleration;
import vectors.Position;
import vectors.Velocity;

public class AppControl implements InterfaceEvents, SketchEvents {

    private ProcessingSketch sketch;
    private ToolInterface toolInterface;

    public void startApp() {

        sketch = new ProcessingSketch();
        toolInterface = new ToolInterface();

        toolInterface.setVisible(true);
        toolInterface.setInterfaceEvents(this);
        sketch.run(this);

    }

    @Override
    public void requestBallPosition() {
        sketch.isAskingForBallPosition = true;
    }

    @Override
    public void requesBallCreation(Position ballPosition, 
        Velocity ballVelocity, Acceleration ballAccceleration){
        
        sketch.createBall(ballPosition, ballVelocity, ballAccceleration);
    }

    @Override
    public void starSimulation() {
        
    }

    @Override
    public void stopSimulation() {

    }

    @Override
    public void restartSimulation() {

    }

    @Override
    public void sendBallPosition(Position ballPosition) {
        toolInterface.setBallPosition(ballPosition);
    }

    

}