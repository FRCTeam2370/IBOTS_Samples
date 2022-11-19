
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_LEDs;

public class com_Turn_off_LEDs extends CommandBase {
  public com_Turn_off_LEDs(sub_LEDs m_LEDS) {
    addRequirements(m_LEDS);
  }

  @Override
  public void initialize() {
    sub_LEDs.LEDs_Off();
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
