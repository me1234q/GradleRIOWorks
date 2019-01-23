package frc.team972.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

	WPI_TalonSRX talon = new WPI_TalonSRX(0);

	@Override
	public void robotInit() {
		talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 100);
	}

	@Override
	public void robotPeriodic() {
	}

	@Override
	public void autonomousInit() {
	}

	@Override
	public void teleopInit() {

	}
	
	int pos;
	int vel;
	
	double kP = 2.8284;
	double kV = 0.5090;

	double u;
	
	@Override
	public void teleopPeriodic() {
		pos = talon.getSensorCollection().getQuadraturePosition();
		vel = talon.getSensorCollection().getQuadratureVelocity();
		
		u = -(kP * pos + kV * vel);
		
		u = Math.min(u, 3);
		u = Math.max(u, -3);
		
		talon.set(u);
	}

	@Override
	public void testInit() {

	}

	@Override
	public void disabledInit() {
	}

}
