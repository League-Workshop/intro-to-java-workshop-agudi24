package day5;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot adibot = new Robot ("batman");
		adibot.setPenColor(255, 0, 0);
		adibot.setSpeed(1000);
		adibot.penDown();
		adibot.move(100);
		adibot.turn(90);
		adibot.move(100);
		adibot.turn(90);
		adibot.move(100);
		adibot.turn(180);
		adibot.move(50);
		adibot.turn(270);
		adibot.move(100);
		adibot.penUp();
		adibot.move(-200);
		
		
	}

}
