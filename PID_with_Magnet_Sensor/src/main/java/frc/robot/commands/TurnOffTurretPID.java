package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.PIDTurretSubsystem;

public class TurnOffTurretPID extends CommandBase {

  public TurnOffTurretPID(PIDTurretSubsystem turret) {
      addRequirements(turret);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    PIDTurretSubsystem.TurretMotor.set(ControlMode.PercentOutput, RobotContainer.m_controller.getRawAxis(0));
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
