package frc.robot.commands.Autonomous;

import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Talon;

public class automata extends SequentialCommandGroup {
  Talon talonOne;

  public automata(Talon talonOne){
    this.talonOne = talonOne;
    addRequirements(talonOne);

    addCommands(
      new ParallelDeadlineGroup(new WaitCommand(5), new SequentialCommandGroup(new motoAuto(talonOne))), 
      new ParallelDeadlineGroup(new WaitCommand(5), new SequentialCommandGroup(new motoAutoBack(talonOne)))

    );
  }
}
