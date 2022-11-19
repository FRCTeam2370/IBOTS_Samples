package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_LEDs;

public class com_LEDs_Red extends CommandBase {
  public com_LEDs_Red(sub_LEDs m_LEDs) {
    addRequirements(m_LEDs);
  }

  @Override
  public void initialize() {
    sub_LEDs.LEDs_Red();
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
