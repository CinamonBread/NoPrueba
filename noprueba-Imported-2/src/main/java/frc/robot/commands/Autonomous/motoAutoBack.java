package frc.robot.commands.Autonomous;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Talon;

public class motoAutoBack extends Command {
  Talon talon;
  public motoAutoBack(Talon talon) {
    this.talon = talon;
    addRequirements(talon);
  }

  
  @Override
  public void initialize() {

  }

  
  @Override
  public void execute() {
    talon.setMotorBackAuto();
  }

  
  @Override
  public void end(boolean interrupted) {
    talon.setMotorOff();

  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
