package forms;

import vectors.Acceleration;
import extras.Utils;

public class AccelerationForm extends DataForm{
    
    public AccelerationForm(String ax, String ay) {
        super(ax, ay);

        this.validateFloatData();
    }

    public Acceleration getValidatedData(boolean trasnformUnit) {
        if (isDataValid) {

            float ax = Float.parseFloat(this.getX());
            float ay = Float.parseFloat(this.getY());

            if (trasnformUnit) {
                ax = Utils.fromMpsToPpt(ax);
                ay = Utils.fromMpsToPpt(ay);
            }

            return new Acceleration(ax, ay);
        }

        return null;
    }
}