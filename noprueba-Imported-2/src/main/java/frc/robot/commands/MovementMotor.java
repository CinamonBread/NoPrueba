// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Talon;

public class MovementMotor extends Command {
  Talon talon;

  public MovementMotor(Talon talon) {
    this.talon = talon;
    addRequirements(talon);
  
    
  }

  public void addRequirements(Talon talon2) {
    }
  
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    talon.setMotorPower(0.7);

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
