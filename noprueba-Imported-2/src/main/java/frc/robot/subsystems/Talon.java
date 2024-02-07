package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class Talon extends SubsystemBase {

  TalonSRX TalonSRX = new TalonSRX(MotorConstants.talonID);

  public Talon() {
    
  }

  @Override
  public void periodic() {

  }

  
     
  public void setMotorPower(double motoMove){
    TalonSRX.set(ControlMode.PercentOutput, motoMove);
  }
  
  public void setMotorAuto() {
    TalonSRX.set(ControlMode.PercentOutput, 0.7);
  }
  public void setMotorBackAuto() {
    TalonSRX.set(ControlMode.PercentOutput, -0.7);
  }
  public void setMotorOff() {
    TalonSRX.set(ControlMode.PercentOutput, 0);
  }

  
}
