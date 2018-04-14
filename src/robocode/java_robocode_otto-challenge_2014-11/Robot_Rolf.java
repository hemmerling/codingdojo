package de.otto;

import static robocode.util.Utils.normalRelativeAngleDegrees;
import robocode.*;

import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Gelb301 - a robot by Rolf Hemmerling
 */
public class Robot_Rolf extends Robot
{
	int others; // Number of other robots in the game
	static int corner = 0; // Which corner we are currently using
	// static so that it keeps it between rounds.
	boolean stopWhenSeeRobot = false; // See goCorner()

	/**
	 * run: Gelb301's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.yellow,Color.yellow,Color.yellow); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			myBehaviour01();
		}
	}
	
	boolean notInCorner = true;
	int angel = -3;
	int angel_direction = 0;
	
	private void myBehaviour01()
	{
		// Save # of other bots
		others = getOthers();
		System.out.printf("We are %s", others);
		switch (others) {
			case 0: gegner0();
					break;
			case 1: gegner1();
					break;
			case 2: gegner2();
					break;
			case 3: gegner3();
					break;
			case 4: gegner4();
					break;
			case 5: gegner5();
					break;
			case 6: gegner6();
					break;
			default: gegner7();
					break;
		
		}

	}

	private void gegner0()
	{
		out.printf("0 Gegner\n");
		myState();
	}

	private void gegner1()
	{
		out.printf("1 Gegner\n");
		myState();
	}

	private void gegner2()
	{
		out.printf("2 Gegner\n");
		myState();
	}
	
	private void gegner3()
	{
		out.printf("3 Gegner\n");
		myState();
	}

	private void gegner4()
	{
		out.printf("4 Gegner\n");
		myState();
	}

	private void gegner5()
	{
		out.printf("5 Gegner\n");
		myState();
	}

	private void gegner6()
	{
		out.printf("6 Gegner\n");
		myState();
	}

	private void gegner7()
	{
		out.printf("7 Gegner\n");
		myState();
	}

	int state = 0;
	
	private void myState() {
	 	
		switch (state) {
			case 0: state0();
				break;
			case 1: state1();
				break;
			default: state2();
				break;
		}

	}
		
	private void state0()
	{
		out.printf("0 State\n");
		myBehaviour02();
	}

	private void state1()
	{
		out.printf("1 State\n");
	}
	
	private void state2()
	{
		out.printf("2 State\n");
	}



	private void myBehaviour02()
	{
		if (notInCorner)
		{
			goCorner(); // Move to a corner
			out.print("gelb in Ecke");
			notInCorner = false;
		}
		else {
			angel_direction += angel;
			if ((angel_direction) >= 10) {
				angel = - angel;
			}
			else if ((angel_direction) <= -100) {
				angel = - angel;
			}	
			turnGunRight(angel);
			fire(1);
		}		
	}
	

	private void myBehaviour03()
	{
		ahead(100);
		turnGunRight(360);
		back(100);
		turnGunRight(360);
		
	}
	
	/**
	 * goCorner:  A very inefficient way to get to a corner.  Can you do better?
	 */
	public void goCorner() {
		// We don't want to stop when we're just turning...
		//stopWhenSeeRobot = false;
		// turn to face the wall to the "right" of our desired corner.
		turnRight(normalRelativeAngleDegrees(corner - getHeading()));
		// Ok, now we don't want to crash into any robot in our way...
		//stopWhenSeeRobot = true;
		// Move to that wall
		ahead(5000);
		// Turn to face the corner
		turnLeft(90);
		// Move to the corner
		ahead(5000);
		// Turn gun to starting point
		turnGunLeft(90);
	}
	
	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		//back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
