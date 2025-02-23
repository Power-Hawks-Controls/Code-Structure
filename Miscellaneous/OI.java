package frc.robot.Miscellaneous;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Miscellaneous.Constants.OIConstants;


public class OI {
    private Joystick driver;
    private Joystick operator;
    
    public OI(){
        driver = new Joystick(OIConstants.kDriverID);
        operator = new Joystick(OIConstants.kOperatorID);
        configureJoysticks();
    }
    private void configureJoysticks(){}
}
