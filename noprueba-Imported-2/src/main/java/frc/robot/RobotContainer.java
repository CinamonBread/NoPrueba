package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.MoveBack;
import frc.robot.commands.MovementMotor;
import frc.robot.commands.Autonomous.automata;
import frc.robot.commands.teleOp.teleOpControl;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private Joystick /*controlname */ = new Joystick(0);
  private Talon talonsub = new Talon();
  private DriveTrain driveTrain = new DriveTrain();

  private automata automata = new automata(talonsub);




  public RobotContainer() {
    configureBindings();
  }

  
  private void configureBindings() {

    new JoystickButton(/*controlname */, 4).whileTrue(new MovementMotor(talonsub));
    new JoystickButton(/*controlname */, 3).whileTrue(new MoveBack(talonsub));

    driveTrain.setDefaultCommand(new teleOpControl(driveTrain, /*controlname */)); 



  
  }


  public Command getAutonomousCommand() {
    
    return automata;
  }
}

/*each default command requires a subsystem...

*/

