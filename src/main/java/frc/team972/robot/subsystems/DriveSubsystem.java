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

    WPI_TalonSRX t1 = new WPI_TalonSRX(2);
    WPI_TalonSRX t2 = new WPI_TalonSRX(1);

    WPI_TalonSRX a1 = new WPI_TalonSRX(3);
    WPI_TalonSRX a2 = new WPI_TalonSRX(4);

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
        if (j.getRawButton(5) && !j.getRawButton(6)) {
            s.set(DoubleSolenoid.Value.kForward); 
        } else if (j.getRawButton(6) && !j.getRawButton(5)) {
            s.set(DoubleSolenoid.Value.kReverse); 
        } else {
            s.set(DoubleSolenoid.Value.kOff); 
        }

        t1.set(ControlMode.PercentOutput, -j.getRawAxis(1)/2);
        t2.set(ControlMode.PercentOutput, j.getRawAxis(5)/2);

        if (j.getRawButton(1) && !j.getRawButton(2)) {
            a1.set(ControlMode.PercentOutput, 0.5);
        } else if (j.getRawButton(2) && !j.getRawButton(1)) {
            a1.set(ControlMode.PercentOutput, -0.5);
        } else {
            a1.set(ControlMode.PercentOutput, 0);
        }

        if (j.getRawButton(3) && !j.getRawButton(4)) {
            a2.set(ControlMode.PercentOutput, 0.5);
        } else if (j.getRawButton(4) && !j.getRawButton(3)) {
            a2.set(ControlMode.PercentOutput, -0.5);
        } else {
            a2.set(ControlMode.PercentOutput, 0);
        }
    }

    public void outputTelemetry() {
    }

    public void stop() {
    }   

    public void zeroSensors() {
    }
}