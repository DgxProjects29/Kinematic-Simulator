package interfaces;

public class DataForm {
    
    private String x;
    private String y;
    public String error_messages;
    public boolean isDataValid = true;

    public DataForm(String x, String y) {
        this.x = x;
        this.y = y;
        
        error_messages = "";
    }

    protected void validateFloatData() {
        try {
            Float.parseFloat(x);
            Float.parseFloat(y);
        } catch (Exception e) {
            error_messages += "La entrada de valores debe ser valida";
            isDataValid = false;
        }
    }

    protected String getX(){
        return x;
    }

    protected String getY() {
        return y;
    }
}