package frc.robot;

import frc.robot.commands.com_Limelight;
import frc.robot.subsystems.sub_Limelight;

public class RobotContainer {

  private final sub_Limelight m_limelight = new sub_Limelight();

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    m_limelight.setDefaultCommand(new com_Limelight(m_limelight));
  }
}
