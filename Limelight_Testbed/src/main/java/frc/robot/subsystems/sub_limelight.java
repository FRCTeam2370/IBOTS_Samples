// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class sub_limelight extends SubsystemBase {

  public static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");

  public static NetworkTableEntry validtargets = table.getEntry("tv");  // Boolean - does it see any valid targets?
  //public static NetworkTableEntry x = table.getEntry("tx");             // Horizontal offset -29.8 to 29.8 degrees
  public static NetworkTableEntry y = table.getEntry("ty");             // Vertical offset -24.85 to 34.85 degrees
  public static NetworkTableEntry a = table.getEntry("ta");             // Target area 0-100%


  
  public sub_limelight() {
  }

  public static double getLimelightX() {
    return  table.getEntry("tx").getDouble(0.0);
  }



  @Override
  public void periodic() {
    //SmartDashboard.putNumber("X Offset", x_offset);
    SmartDashboard.putNumber("Limelight y", y.getDouble(0.0));
    SmartDashboard.putNumber("Limelight Area", a.getDouble(0.0));
    // This method will be called once per scheduler run
  }
}
