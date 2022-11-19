package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PIDTurretSubsystem;

public class Turret_Reset_Encoder extends CommandBase {

  public Turret_Reset_Encoder(PIDTurretSubsystem turret) {
    addRequirements(turret);
  }

  @Override
  public void initialize() {
    PIDTurretSubsystem.Turret_Reset_Encoder();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
