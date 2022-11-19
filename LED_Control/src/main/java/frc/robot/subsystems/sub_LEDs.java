// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class sub_LEDs extends SubsystemBase {

  public static AddressableLED m_LED_Strip1 = new AddressableLED(0);
  public static AddressableLEDBuffer m_LED_Buffer1 = new AddressableLEDBuffer(Constants.LED_Strip_Length);
  public static  ShuffleboardTab myTab = Shuffleboard.getTab("LEDs");
  public static NetworkTableEntry SelectedLEDColor = myTab.add("LED Color", 1).getEntry();



  public sub_LEDs() {
    m_LED_Strip1.setLength(m_LED_Buffer1.getLength());
    m_LED_Strip1.setData(m_LED_Buffer1);
    m_LED_Strip1.start();


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void LEDs_Red(){
    for(var i=0; i<m_LED_Buffer1.getLength(); i++){
      m_LED_Buffer1.setRGB(i, 255, 0, 0);
    }
    m_LED_Strip1.setData(m_LED_Buffer1);
  }

  public static void LEDs_Green(){
    for(var i=0; i<m_LED_Buffer1.getLength(); i++){
      m_LED_Buffer1.setRGB(i, 0, 255, 0);
    }
    m_LED_Strip1.setData(m_LED_Buffer1);
  }

  public static void LEDs_Blue(){
    for(var i=0; i<m_LED_Buffer1.getLength(); i++){
      m_LED_Buffer1.setRGB(i, 0, 0, 255);
    }
    m_LED_Strip1.setData(m_LED_Buffer1);
  }


  public static void LEDs_Off() {
    for(var i=0; i<m_LED_Buffer1.getLength(); i++){
      m_LED_Buffer1.setRGB(i, 0, 0, 0);
    }
    m_LED_Strip1.setData(m_LED_Buffer1);
  }

}
