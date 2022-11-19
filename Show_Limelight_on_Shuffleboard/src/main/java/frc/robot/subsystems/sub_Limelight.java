// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class sub_Limelight extends SubsystemBase {

  public static NetworkTable lltable = NetworkTableInstance.getDefault().getTable("Limelight");

  public static NetworkTableEntry tx = lltable.getEntry("tx");
  public static NetworkTableEntry ty = lltable.getEntry("ty");
  public static NetworkTableEntry ta = lltable.getEntry("ta");

  //read values periodically
  public static double getLimelightX(){
    return tx.getDouble(0.0);
  }

  public static double getLimelightY(){
    return ty.getDouble(0.0);
  }
    
  public static double getLimelightArea(){
    return ta.getDouble(0.0);
  }

  public sub_Limelight() {
    SmartDashboard.putNumber("Test2", 2);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //SmartDashboard.putNumber("Comp LimelightX", Math.round(getLimelightX()*100)/100D);
    //SmartDashboard.putNumber("Comp LimelightY", Math.round(getLimelightY()*100)/100D);
    SmartDashboard.putNumber("Test1", 1);
  }
}
