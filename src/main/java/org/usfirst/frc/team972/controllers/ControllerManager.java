package frc.team972.robot.controllers;

import edu.wpi.first.wpilibj.Joystick;

public class ControllerManager {

    private static ControllerManager instance = new ControllerManager();

    //Put all Controller objects here
    private Joystick exampleJoy = new Joystick(0);

    //Put all values and their defaults to be kept track of here
    public double exampleDouble;
    public double exampleBoolean;

    public ControllerManager() {
        updateInputs();
    }

    //Replaces all input values based on controllers
    public void updateInputs() {
        exampleDouble = handleDeadband(exampleJoy.getRawAxis(1), 0.05);
        exampleBoolean = exampleJoy.getRawButton(1);
    }

    //Returns 0 if a value is under a given deadband
    private double handleDeadband(value, deadband) {
        return (Math.abs(value) < deadband) ? 0 : value;
    }

    public ControllerManager getInstance() {
        return instance;
    }
}