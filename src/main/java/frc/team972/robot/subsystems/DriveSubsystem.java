package frc.team972.robot.subsystems;

import frc.team972.robot.*;
import edu.wpi.first.wpilibj.*;

import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.motorcontrol.*;

import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

public class DriveSubsystem extends Subsystem {

    Compressor c = new Compressor(0);
    DoubleSolenoid s = new DoubleSolenoid(6, 7);
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
        if (j.getRawButton(1) && !j.getRawButton(2)) {
            s.set(DoubleSolenoid.Value.kForward); 
        } else if (j.getRawButton(2) && !j.getRawButton(1)) {
            s.set(DoubleSolenoid.Value.kReverse); 
        } else {
            s.set(DoubleSolenoid.Value.kOff); 
        }
    }

    public void outputTelemetry() {
    }

    public void stop() {
    }   

    public void zeroSensors() {
    }
}