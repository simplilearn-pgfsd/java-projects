package simplilearn;

import javax.swing.JOptionPane;

public class DialogBoxInputExample {

	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Enter the value for x : ");
		
		int x = Integer.parseInt(value);
		
		System.out.println("X value is : " +x);
	}

}
