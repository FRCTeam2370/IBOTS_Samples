package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_Pnuematics;

public class com_OpenCylinder extends CommandBase {

  public com_OpenCylinder(sub_Pnuematics m_pnuematics) {
    addRequirements(m_pnuematics);
  }

  @Override
  public void initialize() {
    sub_Pnuematics.OpenCylinder();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
