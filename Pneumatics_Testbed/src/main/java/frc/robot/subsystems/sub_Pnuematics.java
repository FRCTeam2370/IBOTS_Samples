// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.ejml.dense.row.linsol.qr.SolvePseudoInverseQrp_DDRM;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class sub_Pnuematics extends SubsystemBase {

  public static Compressor AirCompressor = new Compressor(0,PneumaticsModuleType.CTREPCM);
  public static DoubleSolenoid Solenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,0,1);
  public static PneumaticsControlModule PCM1 = new PneumaticsControlModule();

  public sub_Pnuematics() {
    AirCompressor.enableDigital();
    boolean AirCompressorEnabled = AirCompressor.enabled();
    boolean AirPressureSwitch = AirCompressor.getPressureSwitchValue();
  }

  public static void OpenCylinder(){
    Solenoid1.set(Value.kForward);
  }

  public static void CloseCylinder(){
    Solenoid1.set(Value.kReverse);
  }

  public static void EnableCompressor(){
    AirCompressor.enableDigital();
  }

  public static void DisableCompressor(){
    AirCompressor.disable();
  }

  @Override
  public void periodic() {
    SmartDashboard.putBoolean("Air Compressor Enabled", AirCompressor.enabled());
  }
}
