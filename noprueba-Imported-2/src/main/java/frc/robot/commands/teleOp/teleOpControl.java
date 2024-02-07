package frc.robot.commands.teleOp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class teleOpControl extends Command {
  DriveTrain driveTrain;
  Joystick xboxController;

  public teleOpControl(DriveTrain driveTrain, Joystick xboxController) {
    this.driveTrain = driveTrain;
    this.xboxController = xboxController;

    addRequirements(driveTrain);

  }

  
  @Override
  public void initialize() {

  }

  
  @Override
  public void execute() {
    driveTrain.drive(xboxController, 0.7, 0.4);

  }

  
  @Override
  public void end(boolean interrupted) {
    driveTrain.tankDriveVolts(0, 0);
    
  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
