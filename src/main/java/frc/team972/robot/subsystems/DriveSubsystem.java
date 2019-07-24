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

    WPI_TalonSRX t1 = new WPI_TalonSRX(3);
    WPI_TalonSRX t2 = new WPI_TalonSRX(4);

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

        t1.set(ControlMode.PercentOutput, j.getRawAxis(1)/2);
        t2.set(ControlMode.PercentOutput, j.getRawAxis(5)/2);
    }

    public void outputTelemetry() {
    }

    public void stop() {
    }   

    public void zeroSensors() {
    }
}