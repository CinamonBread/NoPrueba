
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  WPI_VictorSPX frontLeft = new WPI_VictorSPX(0);
  WPI_VictorSPX backLeft = new WPI_VictorSPX(1);
  WPI_VictorSPX frontRight = new WPI_VictorSPX(2);
  WPI_TalonSRX backRight = new WPI_TalonSRX (3);

  MotorControllerGroup leftMots = new MotorControllerGroup(frontLeft, backLeft);
  MotorControllerGroup rightMots = new MotorControllerGroup(frontRight, backRight);
  
  DifferentialDrive differentialDrive = new DifferentialDrive(leftMots, rightMots);


  public DriveTrain() {
  
    frontRight.setInverted(true);
    backRight.setInverted(true);
    frontLeft.setInverted(false);
    backLeft.setInverted(false);

    backLeft.follow(frontLeft);
    backRight.follow(frontRight);

    

  }

  @Override
  public void periodic(){}

  public void drive(Joystick xboxController, double distanceController, double turn) {
    differentialDrive.arcadeDrive(distanceController, turn);

    
  }

  public void tankDriveVolts(double leftVolts, double rightVolts){
    leftMots.setVoltage(leftVolts);
    rightMots.setVoltage(rightVolts);
    /*voltage =/= speed */
    differentialDrive.feed();


  }

}
