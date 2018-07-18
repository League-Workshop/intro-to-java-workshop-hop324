import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		//JOptionPane.showInputDialog("Wat be ur name?");
		String livin = JOptionPane.showInputDialog("Name?");
	    JOptionPane.showMessageDialog(null, livin);
	    System.out.println("You are " + livin + ", Sweet");
	    System.out.println("NOW DIE");
	}

}
