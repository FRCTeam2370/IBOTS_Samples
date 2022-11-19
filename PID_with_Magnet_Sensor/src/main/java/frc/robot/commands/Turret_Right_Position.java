package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PIDTurretSubsystem;

public class Turret_Right_Position extends CommandBase {

  public Turret_Right_Position(PIDTurretSubsystem turret) {
    addRequirements(turret);
  }

  @Override
  public void initialize() {
    PIDTurretSubsystem.TurretMotor.set(ControlMode.Position, 0);
  }

  @Override
  public void execute() {
    if(PIDTurretSubsystem.MagneticSensor.get() == false) {
      PIDTurretSubsystem.Turret_Reset_Encoder();
    }
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
