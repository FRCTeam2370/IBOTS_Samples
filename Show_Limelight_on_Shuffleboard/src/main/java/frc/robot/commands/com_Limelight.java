package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_Limelight;

public class com_Limelight extends CommandBase {

  public com_Limelight(sub_Limelight m_limelight) {
    addRequirements(m_limelight);
  }

  @Override
  public void initialize() {
    //sub_Limelight.getLimelightX();
    SmartDashboard.putNumber("Test3", 3);
    //SmartDashboard.putNumber("X", sub_Limelight.getLimelightX());
  }

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
