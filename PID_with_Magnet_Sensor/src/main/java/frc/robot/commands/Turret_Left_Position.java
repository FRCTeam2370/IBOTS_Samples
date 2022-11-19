package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PIDTurretSubsystem;

public class Turret_Left_Position extends CommandBase {

  public Turret_Left_Position(PIDTurretSubsystem turret) {
    addRequirements(turret);
  }

  @Override
  public void initialize() {
    PIDTurretSubsystem.SendNewPIDVariables();
    PIDTurretSubsystem.TurretMotor.set(ControlMode.Position, -50000);
  }

  @Override
  public void execute() {

  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
