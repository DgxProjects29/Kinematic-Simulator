package main;

import vectors.Acceleration;
import vectors.Position;
import vectors.Velocity;

public interface InterfaceEvents {
    
    public void requestBallPosition();

    public void requesBallCreation(Position ballPosition, 
        Velocity ballVelocity, Acceleration ballAccceleration);

    public void starSimulation();

    public void stopSimulation();

    public void restartSimulation();

}