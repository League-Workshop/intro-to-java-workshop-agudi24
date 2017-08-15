package day3;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot r2d2 = new Robot ();
		r2d2.setSpeed(1000);
		r2d2.setPenColor(255, 0, 0);
		
		r2d2.penDown();
		for (int i = 0; i < 8; i++) {
			
			r2d2.move(100);
			r2d2.turn(360/8);
			
		}
		
	}

}
