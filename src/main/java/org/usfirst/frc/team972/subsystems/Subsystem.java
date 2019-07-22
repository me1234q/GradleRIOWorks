package frc.team972.robot.subsystems;

public abstract class Subsystem {

    private static Subsystem instance;

	public abstract void init();

    public abstract void periodic();

    public abstract void outputTelemetry();

    public abstract void stop();

    public abstract void zeroSensors();

    public void getInstance() {
        return instance;
    }
}