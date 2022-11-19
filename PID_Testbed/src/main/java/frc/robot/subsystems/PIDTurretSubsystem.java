// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PIDTurretSubsystem extends SubsystemBase {

  public static WPI_TalonFX TurretMotor = new WPI_TalonFX(20);

  private static void ResetTurretMotor(WPI_TalonFX motor) {
    motor.configFactoryDefault();
    motor.config_kP(0, 0.1);
    motor.config_kI(0, 0);
    motor.config_kD(0, 0);
    motor.setNeutralMode(NeutralMode.Coast);
    motor.setStatusFramePeriod(StatusFrame.Status_1_General, 25);
    motor.configClosedLoopPeakOutput(0, 0.1);
  }

  /** Creates a new PIDTurretSubsystem. */
  public PIDTurretSubsystem() {
    ResetTurretMotor(TurretMotor);
  }

  public static void GoToPosition(double position) {
    TurretMotor.set(ControlMode.Position, position);
  }


  public static void StopTurret() {
    TurretMotor.stopMotor();
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Encoder Reading", TurretMotor.getSensorCollection().getIntegratedSensorPosition());
    SmartDashboard.putNumber("Encoder Speed", TurretMotor.getSensorCollection().getIntegratedSensorVelocity());
  }
}
