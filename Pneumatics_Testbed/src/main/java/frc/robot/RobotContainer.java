// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.com_CloseCylinder;
import frc.robot.commands.com_DisableCompressor;
import frc.robot.commands.com_EnableCompressor;
import frc.robot.commands.com_OpenCylinder;
import frc.robot.subsystems.sub_Pnuematics;

public class RobotContainer {

  private final sub_Pnuematics m_sub_pnematics = new sub_Pnuematics();

  public static GenericHID Controller1 = new GenericHID(0);
  public static JoystickButton A = new JoystickButton(Controller1, 1);
  public static JoystickButton B = new JoystickButton(Controller1, 2);
  public static JoystickButton X = new JoystickButton(Controller1, 3);
  public static JoystickButton Y = new JoystickButton(Controller1, 4);
  public static JoystickButton Back = new JoystickButton(Controller1, 7);
  public static JoystickButton Start = new JoystickButton(Controller1, 8);


  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    A.whenPressed(new com_OpenCylinder(m_sub_pnematics));
    B.whenPressed(new com_CloseCylinder(m_sub_pnematics));
    Start.whenPressed(new com_EnableCompressor(m_sub_pnematics));
    Back.whenPressed(new com_DisableCompressor(m_sub_pnematics));
  }

}
