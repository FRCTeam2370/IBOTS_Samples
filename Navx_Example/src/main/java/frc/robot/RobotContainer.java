package frc.robot;

import frc.robot.commands.com_navx;
import frc.robot.subsystems.sub_navx;

public class RobotContainer {
  // Subsystems and commands
  private final sub_navx s = new sub_navx();

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    s.setDefaultCommand(new com_navx(s));
  }
     
}
