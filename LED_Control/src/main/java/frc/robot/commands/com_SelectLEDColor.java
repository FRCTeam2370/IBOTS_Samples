package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.sub_LEDs;

public class com_SelectLEDColor extends CommandBase {


  public com_SelectLEDColor(sub_LEDs m_LEDs) {
    addRequirements(m_LEDs);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double selectedColor = sub_LEDs.SelectedLEDColor.getDouble(0);
    if(selectedColor == 1){
      sub_LEDs.LEDs_Red();
    }
    else if(selectedColor == 2){
      sub_LEDs.LEDs_Green();
    }
    else if(selectedColor == 3){
      sub_LEDs.LEDs_Blue();
    }
    else {
      sub_LEDs.LEDs_Off();
    }
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
