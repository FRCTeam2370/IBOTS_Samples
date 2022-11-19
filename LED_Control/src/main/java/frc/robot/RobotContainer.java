package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.com_SelectLEDColor;
import frc.robot.commands.com_Turn_off_LEDs;
import frc.robot.subsystems.sub_LEDs;

public class RobotContainer {

  private final sub_LEDs m_sub_LEDs = new sub_LEDs();

  public static GenericHID Controller1 = new GenericHID(0);
  public static JoystickButton A = new JoystickButton(Controller1, 1);
  public static JoystickButton B = new JoystickButton(Controller1, 2);
  public static JoystickButton X = new JoystickButton(Controller1, 3);
  public static JoystickButton Y = new JoystickButton(Controller1, 4);

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    m_sub_LEDs.setDefaultCommand(new com_SelectLEDColor(m_sub_LEDs));
    //m_sub_LEDs.setDefaultCommand(new com_Turn_off_LEDs(m_sub_LEDs));

    //A.whileHeld(new com_LEDs_Red(m_sub_LEDs));

  }


}
