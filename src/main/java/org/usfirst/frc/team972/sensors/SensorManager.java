package frc.team972.robot.sensors;

import edu.wpi.first.wpilibj.Encoder;

public class SensorManager {

    private static SensorManager instance = new SensorManager();

    //Put all sensor objects here
    private Encoder exampleEncoder = new Encoder(0, 1);

    //Put all values and their defaults to be kept track of here
    public double exampleInt;

    public SensorManager() {
        updateSensors();
    }

    //Gets values from sensors
    public void updateSensors() {
        exampleInt = exampleEncoder.get();
    }

    public SensorManager getInstance() {
        return instance;
    }
}