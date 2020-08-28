package interfaces;

import extras.Utils;
import vectors.Velocity;

public class VelocityForm extends DataForm{
    
    
    public VelocityForm(String vx, String vy) {
        super(vx, vy);

        this.validateFloatData();
    }

    public Velocity getValidatedData(boolean trasnformUnit){
        if (isDataValid) {

            float vx = Float.parseFloat(this.getX());
            float vy = Float.parseFloat(this.getY());

            if (trasnformUnit) {
                vx = Utils.fromMpsToPpt(vx);
                vy = Utils.fromMpsToPpt(vy);
            }

            return new Velocity(vx, vy);
        }
        
        return null;
    }
}