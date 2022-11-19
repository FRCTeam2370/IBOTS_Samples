package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ExampleSubsystem;

public class com_Y extends CommandBase {

  public com_Y(ExampleSubsystem m_sSubsystem) {
    addRequirements(m_sSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
