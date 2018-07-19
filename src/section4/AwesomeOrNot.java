package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	int j = new Random().nextInt(4);
	System.out.println(j);
	String y = JOptionPane.showInputDialog("What is awesome?");
	if(j == 0) {
		JOptionPane.showMessageDialog(null, "That's awesome");
		
	}
	if(j == 1) {
		
		JOptionPane.showMessageDialog(null,"That's okay");
	}
	if(j == 2) {
		JOptionPane.showMessageDialog(null,"Booooooorrriingggg");
		
	}
	if(j == 3) {
		JOptionPane.showMessageDialog(null,"That's like eating spaghetting with a sauce that has olives and onions dragged through the sewer on a fishing hook attatched to the back of a farm truck with a leaky exhaust pipe, exhaust splattering all over the sewer juice sauce. It is then thrown out of the sewers, run over 13 times, and then crapped on by every cat in the world and topped with anchovies. I hate anchovies. To sum up, Ding dong, Y O U R  O P I N I O N  I S  W R O N G");
		
	}
	
	
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


