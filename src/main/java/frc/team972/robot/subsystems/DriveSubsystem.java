package frc.team972.robot.subsystems;

import frc.team972.robot.*;
import edu.wpi.first.wpilibj.*;

import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.motorcontrol.*;

import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

public class DriveSubsystem extends Subsystem {

    Compressor c = new Compressor(40);
    DoubleSolenoid s = new DoubleSolenoid(0,1);
    Joystick j = new Joystick(0);


    public DriveSubsystem(Robot robot) {
        super(robot);
    }

	public void robotInit() {
        
    }

	public void autonomousInit() {
    }

    public void autonomousPeriodic() {
    }
	
	public void teleopInit() {
        c.setClosedLoopControl(true);
        c.start();
    }

    public void teleopPeriodic() {
        if (j.getRawButton(0)) {
            s.set(kForward);
            System.out.println("F");
        } else {
            s.set(kReverse);
            System.out.println("R");
        }
    }

    public void outputTelemetry() {
    }

    public void stop() {
    }

    public void zeroSensors() {
    }
}