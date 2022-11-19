package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.TurnOffTurretPID;
import frc.robot.commands.Turret_Left_Position;
import frc.robot.commands.Turret_Reset_Encoder;
import frc.robot.commands.Turret_Right_Position;
import frc.robot.subsystems.PIDTurretSubsystem;

public class RobotContainer {

  private final PIDTurretSubsystem m_PidTurretSubsystem = new PIDTurretSubsystem();

  public static XboxController m_controller = new XboxController(Constants.OIConstants.kDriverControllerPort);

  public static JoystickButton A = new JoystickButton(m_controller, 1);
  public static JoystickButton B = new JoystickButton(m_controller, 2);
  public static JoystickButton X = new JoystickButton(m_controller, 3);
  public static JoystickButton Y = new JoystickButton(m_controller, 4);
  public static JoystickButton Start = new JoystickButton(m_controller, 8);

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    m_PidTurretSubsystem.setDefaultCommand(new TurnOffTurretPID(m_PidTurretSubsystem));

    //A.whileHeld(new TurnMotor(m_turret));
    X.whenPressed(new Turret_Right_Position(m_PidTurretSubsystem));
    A.whenPressed(new TurnOffTurretPID(m_PidTurretSubsystem));
    B.whenPressed(new Turret_Left_Position(m_PidTurretSubsystem));
    Start.whenPressed(new Turret_Reset_Encoder(m_PidTurretSubsystem));

  }

}
