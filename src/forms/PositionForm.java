package forms;

import extras.Utils;
import vectors.Position;

public class PositionForm extends DataForm{
    
    public PositionForm(String x, String y) {
        super(x, y);

        this.validateFloatData();
    }

    public Position getValidatedData(boolean trasnformUnit) {
        if (isDataValid) {

            float x = Float.parseFloat(this.getX());
            float y = Float.parseFloat(this.getY());

            if (trasnformUnit) {
                x = Utils.fromMetersToPixel(x);
                y = Utils.fromMetersToPixel(y);
            }

            return new Position(x, y);
        }

        return null;
    }
}