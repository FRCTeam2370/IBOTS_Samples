package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_limelight;

public class com_Limelight_default extends CommandBase {

  public com_Limelight_default(sub_limelight m_limelight) {
    addRequirements(m_limelight);  
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
