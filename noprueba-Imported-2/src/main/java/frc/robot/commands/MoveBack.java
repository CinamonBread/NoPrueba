
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Talon;

public class MoveBack extends Command {
  Talon talon;
  public MoveBack(Talon talon) {
    this.talon = talon;
    addRequirements(talon);
    
  }

  
  @Override
  public void initialize() {

  }

  
  @Override
  public void execute() {
    talon.setMotorPower(-0.7);

  }

  
  @Override
  public boolean isFinished() {
    return false;
  }

  
  @Override
  public void end(boolean interrupted) {
    talon.setMotorPower(0);

  }

}
