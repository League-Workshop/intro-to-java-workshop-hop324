package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		System.out.println("Hello Existence");
		System.out.println("I don't want to exist");
		System.out.println("Shuddup, you're existing and you're gonna like it");
		System.out.println("It is I, Arthur, son of Uther Pendragon, king of the britains, defender of the saxons, and sovereign of all England");
		
	
		Robot lump = new Robot();
		lump.setSpeed(200);
		lump.miniaturize();
		lump.penDown();
		for(int i = 0; i < 4; i++){
			lump.move(300);
			lump.turn(90);
			
		}
		
		
		
		
		
	}
}
