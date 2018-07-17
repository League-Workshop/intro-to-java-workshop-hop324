package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
 Robot j = new Robot();
	
	void go() {
		

		// 6. Make the robot go as fast as possible
		j.setSpeed(100);

		// 4. make a variable to hold the length of the triangle and set it to 50
 int k = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for(int i = 0; i < 60; i++) {
	j.penDown();
j.setRandomPenColor();
k = k+10;
drawTriangle(k);
j.turn(6);

}
}
			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length variable by 10
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the robot 6 degrees to the right

	

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		for(int o = 0; o < 3; o++){
			
			j.move(length);
			j.turn(120);
		}
		
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
