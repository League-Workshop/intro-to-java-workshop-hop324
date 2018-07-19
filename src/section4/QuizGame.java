package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int q = 0;
		// 2.  Ask the user a question 
		String a = JOptionPane.showInputDialog("What is your name?");
		// 3.  Use an if statement to check if their answer is correct
q = q+1;
String b = JOptionPane.showInputDialog("What is your favorite color?");
		// 4.  if the user's answer is correct
		q = q+1;
		String c = JOptionPane.showInputDialog("What is the wingspan of a swallow");
		// -- add one to their score 
		if(c .equals("African or European?")) {
			JOptionPane.showMessageDialog(null, "Well, I don't now tha-aaaaahhhhh");
			q = q+1;
		}
		JOptionPane.showMessageDialog(null, "You're finished, your score was" + q + "Congrats");
		
		if(q < 3) {
			JOptionPane.showMessageDialog(null, "Y O U  M U S T  D I E !");
			
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
