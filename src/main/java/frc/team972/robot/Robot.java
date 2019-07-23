package frc.team972.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team972.robot.subsystems.*;

public class Robot extends TimedRobot {
	
  public final DriveSubsystem drive = new DriveSubsystem(this);

  private Subsystem[] subsystems = new Subsystem[] {drive};
  private SubsystemManager subsystemManager = new SubsystemManager(subsystems);

  private Pose pose = new Pose();


    @Override
    public void robotInit() {
      subsystemManager.zeroSensorsAll();
      subsystemManager.robotInitAll();
    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void autonomousInit() {
      subsystemManager.autonomousInitAll();
    }

    public void autonomousPeriodic() {
      subsystemManager.autonomousPeriodicAll();
    }

    @Override
    public void teleopInit() {
      subsystemManager.teleopInitAll();
    }

    @Override
    public void teleopPeriodic() {
      subsystemManager.teleopPeriodicAll();
    }

    @Override
    public void testInit() {

    }

    @Override
    public void disabledInit() {
      subsystemManager.stopAll();
    }

    @Override
    public void disabledPeriodic() {
    }

  public Pose getPose() {
    return pose;
  }
}
