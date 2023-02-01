
package frc.robot.commands.TurretPID;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PIDTurretSubsystem;

public class SetpointA extends CommandBase {

  public SetpointA(PIDTurretSubsystem m_turret) {
    addRequirements(m_turret);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    PIDTurretSubsystem.TurretMotor.set(ControlMode.Position, -50000);
  }

  @Override
  public void end(boolean interrupted) {
    PIDTurretSubsystem.TurretMotor.stopMotor();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
