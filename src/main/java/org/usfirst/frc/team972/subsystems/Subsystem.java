package frc.team972.robot.subsystems;

public abstract class Subsystem {

    private static Subsystem instance;

    public void periodic() {
    }

    public abstract void outputTelemetry();

    public abstract void stop();

    public void zeroSensors() {
    }

    public void getInstance() {
        return instance;
    }
}