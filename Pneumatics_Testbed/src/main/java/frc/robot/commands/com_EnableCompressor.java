package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_Pnuematics;

public class com_EnableCompressor extends CommandBase {

  public com_EnableCompressor(sub_Pnuematics m_pnuematics) {
  }

  @Override
  public void initialize() {
    sub_Pnuematics.EnableCompressor();
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
