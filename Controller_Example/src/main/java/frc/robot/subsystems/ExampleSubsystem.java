// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Deadbands;
import frc.robot.RobotContainer;

public class ExampleSubsystem extends SubsystemBase {

  public static  ShuffleboardTab myTab = Shuffleboard.getTab("Deadbands");
  public static NetworkTableEntry DesiredDeadband = myTab.add("Desired Deadband", 1).getEntry();




  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {}

  @Override
  public void periodic() {
    SmartDashboard.putBoolean("A", RobotContainer.A.get());
    SmartDashboard.putBoolean("B", RobotContainer.B.get());
    SmartDashboard.putBoolean("X", RobotContainer.X.get());
    SmartDashboard.putBoolean("Y", RobotContainer.Y.get());
    SmartDashboard.putBoolean("Left Bumper", RobotContainer.LB.get());
    SmartDashboard.putBoolean("Right Bumper", RobotContainer.RB.get());
    SmartDashboard.putBoolean("Start", RobotContainer.Start.get());
    SmartDashboard.putBoolean("Back", RobotContainer.Select.get());
    SmartDashboard.putBoolean("Left Stick Button", RobotContainer.LStickButton.get());
    SmartDashboard.putBoolean("Right Stick Button", RobotContainer.RStickButton.get());

    SmartDashboard.putBoolean("Dpad Down", RobotContainer.DpadDown.get());
    SmartDashboard.putBoolean("Dpad Up", RobotContainer.DpadUp.get());
    SmartDashboard.putBoolean("Dpad Left", RobotContainer.DpadLeft.get());
    SmartDashboard.putBoolean("Dpad Right", RobotContainer.DpadRight.get());



    SmartDashboard.putNumber("Left Stick X", RobotContainer.controller0.getRawAxis(0));
    SmartDashboard.putNumber("Left Stick Y", RobotContainer.controller0.getRawAxis(1));
    SmartDashboard.putNumber("Right Stick X", RobotContainer.controller0.getRawAxis(4));
    SmartDashboard.putNumber("Right Stick Y", RobotContainer.controller0.getRawAxis(5));

    SmartDashboard.putNumber("Deadbanded Left X", Deadbands.LinearDeadband(RobotContainer.controller0, 0, DesiredDeadband.getDouble(0.0)));
    SmartDashboard.putNumber("Deadbanded Left Y", Deadbands.CubedDeadbands(RobotContainer.controller0, 1, 0.5));
  }



}
