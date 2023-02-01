package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

// Commands
import frc.robot.commands.TurretPID.SetpointA;
import frc.robot.commands.TurretPID.SetpointB;
import frc.robot.commands.TurretPID.Stop_Motor;
import frc.robot.commands.TurretPID.TurnMotor;
import frc.robot.commands.TurretPID.TurnOffTurretPID;
import frc.robot.subsystems.PIDTurretSubsystem;
import frc.robot.subsystems.TurretSubsystem;

public class RobotContainer {
  //private final TurretSubsystem m_turret = new TurretSubsystem();
  private final PIDTurretSubsystem m_PIDTurret = new PIDTurretSubsystem();

  public static XboxController m_controller = new XboxController(Constants.OIConstants.kDriverControllerPort);

  public static JoystickButton A = new JoystickButton(m_controller, 1);
  public static JoystickButton B = new JoystickButton(m_controller, 2);
  public static JoystickButton X = new JoystickButton(m_controller, 3);
  public static JoystickButton Y = new JoystickButton(m_controller, 4);

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    //m_turret.setDefaultCommand(new Stop_Motor(m_turret));
    m_PIDTurret.setDefaultCommand(new TurnOffTurretPID(m_PIDTurret));

    //A.whileHeld(new TurnMotor(m_turret));
    X.whenPressed(new SetpointB(m_PIDTurret));
    A.whenPressed(new TurnOffTurretPID(m_PIDTurret));
    B.whenPressed(new SetpointA(m_PIDTurret));
  }  
}
