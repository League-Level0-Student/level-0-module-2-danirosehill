package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you in years?");
	int intage = Integer.parseInt(age);
	
	if (intage>=18) {
		JOptionPane.showInputDialog(null, "Who should the next president be?");
	} else {
		JOptionPane.showMessageDialog(null, "Nobody cares! Try again next year.");
	}
	
	
	
	
	
	
}	
	
	
}
