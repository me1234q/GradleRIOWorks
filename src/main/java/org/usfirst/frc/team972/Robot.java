package frc.team972.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team972.robot.subsystems.*;

public class Robot extends TimedRobot {

    private Subsystem[] subsystems = {ExampleSubsystem.getInstance()};
    private SubsystemManager subsystemManager = new SubsystemManager(subsystems);

    private ControllerSubsystem controllerSubsystem = ControllerSubsystem.getInstance();


    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void autonomousInit() {

    }

    public void autonomousPeriodic() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
         
    }

    @Override
    public void testInit() {

    }

    @Override
    public void disabledInit() {

    }
}
