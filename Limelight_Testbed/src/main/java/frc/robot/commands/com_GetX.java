package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_limelight;

public class com_GetX extends CommandBase {

  public com_GetX(sub_limelight m_limelight) {
      addRequirements(m_limelight);
  }

  @Override
  public void initialize() {
    SmartDashboard.putNumber("test", sub_limelight.getLimelightX());
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return true;
  }
}
