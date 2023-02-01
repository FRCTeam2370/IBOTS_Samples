// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.TurretPID;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PIDTurretSubsystem;
import frc.robot.subsystems.TurretSubsystem;

public class TurnOffTurretPID extends CommandBase {
  /** Creates a new TurnOffTurretPID. */
  public TurnOffTurretPID(PIDTurretSubsystem turret) {
    addRequirements(turret);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    PIDTurretSubsystem.TurretMotor.set(ControlMode.PercentOutput, 0.0);
    PIDTurretSubsystem.TurretMotor.stopMotor();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
