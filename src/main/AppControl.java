package main;

import interfaces.ToolInterface;
import sketch.ProcessingSketch;

public class AppControl {
    
    public static void main(String[] args) {
        
        ProcessingSketch sketch = new ProcessingSketch();
        ToolInterface toolInterface = new ToolInterface();
        
        toolInterface.setVisible(true);
        sketch.run();

    }

}