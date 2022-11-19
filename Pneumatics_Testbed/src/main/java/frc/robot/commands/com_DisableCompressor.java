package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_Pnuematics;

public class com_DisableCompressor extends CommandBase {

  public com_DisableCompressor(sub_Pnuematics m_pneumatics) {
    addRequirements(m_pneumatics);
  }

  @Override
  public void initialize() {
    sub_Pnuematics.DisableCompressor();
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
