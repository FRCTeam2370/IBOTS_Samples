// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class sub_navx extends SubsystemBase {

  // !! Pick a connection type - either MXP Port or USB Connection

  // NAVX Connected via MXP Port
  // public static AHRS ahrs = new AHRS(SPI.Port.kMXP);

  // NAVX Connected via USB
  public static AHRS ahrs = new AHRS(SerialPort.Port.kUSB);

  
  public sub_navx() {}

  @Override
  public void periodic() {
    SmartDashboard.putBoolean("IMU_Connected", ahrs.isConnected());
    SmartDashboard.putBoolean("IMU_IsCalibrating", ahrs.isCalibrating());
    SmartDashboard.putNumber("IMU_Yaw", ahrs.getYaw());
    SmartDashboard.putNumber("IMU_Pitch", ahrs.getPitch());
    SmartDashboard.putNumber("IMU_Roll", ahrs.getRoll());
  }
}
