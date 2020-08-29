package main;

import interfaces.ToolInterface;
import sketch.ProcessingSketch;

public class AppControl implements InterfaceEvents{
    
    private ProcessingSketch sketch;
    private ToolInterface toolInterface;

    public void startApp(String[] args) {
        
        sketch = new ProcessingSketch();
        toolInterface = new ToolInterface();
        
        toolInterface.setVisible(true);
        sketch.run();

    }

    @Override
    public void requestBallPosition() {

    }

    @Override
    public void sendBallData() {

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

    

}