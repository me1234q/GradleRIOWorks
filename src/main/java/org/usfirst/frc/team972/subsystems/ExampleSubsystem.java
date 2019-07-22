package frc.team972.robot.subsystems;

public abstract class ExampleSubsystem extends Subsystem {

    public ExampleSubsystem() {
        super();
    }

    public void periodic() {
    }

    public abstract void outputTelemetry();

    public abstract void stop();

    public void zeroSensors() {
    }
}