package main;

import forms.VelocityForm;
import vectors.Velocity;

public class MyTest {
    
    public static void main(String[] args) {
        
        VelocityForm vform = new VelocityForm("0.a1", "14");
        if (vform.isDataValid) {
            Velocity velocity = vform.getValidatedData(true);
            System.out.println(velocity.x); 
        }else{
            System.out.println(vform.error_messages);
        }
    
    }
}