package frc.team972.robot.subsystems;

public abstract class Subsystem {
	private final Robot robot;
	
	public Subsystem(Robot robot) {
		this.robot = robot;
	}

	public abstract void init();

    public abstract void periodic();

    public abstract void outputTelemetry();

    public abstract void stop();

    public abstract void zeroSensors();
}