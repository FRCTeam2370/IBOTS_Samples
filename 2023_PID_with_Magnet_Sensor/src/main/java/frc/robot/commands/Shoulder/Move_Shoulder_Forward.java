package frc.robot.commands.Shoulder;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.sub_Shoulder;

public class Move_Shoulder_Forward extends CommandBase {

  public Move_Shoulder_Forward(sub_Shoulder shoulder) {
    addRequirements(shoulder);
  }

  @Override
  public void initialize() {
    sub_Shoulder.Set_Shoulder_Motor_Up();
  }

  @Override
  public void execute() {
    sub_Shoulder.Shoulder_motor.set(ControlMode.Position, Constants.ShoulderConstants.ShoulderForwardPosition);

  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
