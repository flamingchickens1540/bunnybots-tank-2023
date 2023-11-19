// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.team1540.bunnybotTank2023;

import edu.wpi.first.wpilibj2.command.Command;
import org.team1540.bunnybotTank2023.commands.auto.TestAuto;
import org.team1540.bunnybotTank2023.commands.drivetrain.Drivetrain;
import org.team1540.bunnybotTank2023.io.drivetrain.DrivetrainIOSim;
import org.team1540.bunnybotTank2023.io.drivetrain.DrivetrainIOSparkMax;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
    public final Drivetrain drivetrain;

    public RobotContainer() {
        if (Robot.isReal()) {
            // Initialize subsystems with hardware IO
            drivetrain = new Drivetrain(new DrivetrainIOSparkMax());
        } else {
            // Initialize subsystems with simulation IO
            drivetrain = new Drivetrain(new DrivetrainIOSim());
        }
        // Configure the trigger bindings
        configureButtonBindings();
    }
    
    
    /** Use this method to define your trigger->command mappings. */
    private void configureButtonBindings() {

    }


    
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return new TestAuto(drivetrain);
    }
}
