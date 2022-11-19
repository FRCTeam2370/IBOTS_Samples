
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PIDTurretSubsystem extends SubsystemBase {

  public static ShuffleboardTab myTab = Shuffleboard.getTab("PID_Tuning");
  public static NetworkTableEntry turret_kP = myTab.add("Turret_kP", 1).getEntry();
  public static NetworkTableEntry turret_kI = myTab.add("Turret_kI", 1).getEntry();
  public static NetworkTableEntry turret_kD = myTab.add("Turret_kD", 1).getEntry();
  public static NetworkTableEntry MaxOutput = myTab.add("Max_Output", 1).getEntry();


  public static WPI_TalonFX TurretMotor = new WPI_TalonFX(Constants.TurretMotorID);
  public static DigitalInput MagneticSensor = new DigitalInput(0);

  private static void ResetTurretMotor(WPI_TalonFX motor) {
    motor.configFactoryDefault();
    SendNewPIDVariables();
    //motor.config_kP(0, 0.1);
    //motor.config_kI(0, 0);
    //motor.config_kD(0, 0);
    motor.setNeutralMode(NeutralMode.Coast);
    motor.setStatusFramePeriod(StatusFrame.Status_1_General, 25);
    motor.configClosedLoopPeakOutput(0, 0.1);
    motor.configClosedloopRamp(0.5);

  }

  public static void SendNewPIDVariables() {
    TurretMotor.config_kP(0, PIDTurretSubsystem.turret_kP.getDouble(0.0));
    TurretMotor.config_kI(0, PIDTurretSubsystem.turret_kI.getDouble(0.0));
    TurretMotor.config_kD(0, PIDTurretSubsystem.turret_kD.getDouble(0.0));
    TurretMotor.configClosedLoopPeakOutput(0, PIDTurretSubsystem.MaxOutput.getDouble(0.0));

  }

  public static void Turret_Reset_Encoder() {
    TurretMotor.getSensorCollection().setIntegratedSensorPosition(0, 10);
  }

  public PIDTurretSubsystem() {
    ResetTurretMotor(TurretMotor);
  }


  
  @Override
  public void periodic() {
    SmartDashboard.putNumber("Encoder Reading", TurretMotor.getSensorCollection().getIntegratedSensorPosition());
    SmartDashboard.putNumber("Encoder Speed", TurretMotor.getSensorCollection().getIntegratedSensorVelocity());
    SmartDashboard.putNumber("Error", TurretMotor.getClosedLoopError());
    SmartDashboard.putBoolean("Magnetic Sensor", MagneticSensor.get());

    SmartDashboard.putNumber("Forward Limit Switch", TurretMotor.isFwdLimitSwitchClosed());
    SmartDashboard.putNumber("Reverse Limit Switch", TurretMotor.isRevLimitSwitchClosed());



    SmartDashboard.putNumber("Motor Temperature", TurretMotor.getTemperature());
    SmartDashboard.putNumber("Supply Current", TurretMotor.getSupplyCurrent());
    SmartDashboard.putString("Control Mode", TurretMotor.getControlMode().toString());
    SmartDashboard.putNumber("Bus Voltage", TurretMotor.getBusVoltage());
  }
}
