package frc.team972.robot.subsystems;

import frc.team972.robot.subsystems.*;

public abstract class SubsystemManager {

    private Subsystem[] subsystems;

    public SubsystemManager() {
        this(new Subsystem[]);
    }

    public SubsystemManager(Subsystem[] subsystems) {
        this.subsystems = subsystems;
    }
	
	public void init() {
        for (Subsystem subsystem : subsystems) {
            subsystem.init();
        }
    }

    public void periodic() {
        for (Subsystem subsystem : subsystems) {
            subsystem.periodic();
        }
    }

    public void outputTelemetry() {
        for (Subsystem subsystem : subsystems) {
            subsystem.outputTelemetry();
        }
    }

    public void stop() {
        for (Subsystem subsystem : subsystems) {
            subsystem.stop();
        }
    }

    public void zeroSensors() {
        for (Subsystem subsystem : subsystems) {
            subsystem.seroSensors();
        }
    }
}