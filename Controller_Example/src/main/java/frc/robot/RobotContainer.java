package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ExampleDefaultCommand;
import frc.robot.commands.com_A;
import frc.robot.commands.com_B;
import frc.robot.commands.com_X;
import frc.robot.commands.com_Y;
import frc.robot.subsystems.ExampleSubsystem;

public class RobotContainer {

  private final ExampleSubsystem m_examplesub = new ExampleSubsystem();
  public static GenericHID controller0 = new GenericHID(0);

  // Look at the DpadButton.java file.  Max extends the Trigger object to allow
  // use of the Dpad directions into buttons
  public static DpadButton DpadUp = new DpadButton(controller0, 0);
  public static DpadButton DpadRight = new DpadButton(controller0, 90);
  public static DpadButton DpadDown = new DpadButton(controller0, 180);
  public static DpadButton DpadLeft = new DpadButton(controller0, 270);
  
  public static JoystickButton A = new JoystickButton(controller0, 1);
  public static JoystickButton B = new JoystickButton(controller0, 2);
  public static JoystickButton X = new JoystickButton(controller0, 3);
  public static JoystickButton Y = new JoystickButton(controller0, 4);
  public static JoystickButton LB = new JoystickButton(controller0, 5);
  public static JoystickButton RB = new JoystickButton(controller0, 6);
  public static JoystickButton Select = new JoystickButton(controller0, 7);
  public static JoystickButton Start = new JoystickButton(controller0, 8);
  public static JoystickButton LStickButton = new JoystickButton(controller0, 9);
  public static JoystickButton RStickButton = new JoystickButton(controller0, 10);


  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    m_examplesub.setDefaultCommand(new ExampleDefaultCommand(m_examplesub));

    A.whileHeld(new com_A(m_examplesub));
    B.whileHeld(new com_B(m_examplesub));
    X.whileHeld(new com_X(m_examplesub));
    Y.whileHeld(new com_Y(m_examplesub));
  }
}
