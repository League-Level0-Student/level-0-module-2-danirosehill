//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	
	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("Ask the magic 8 ball a question!");
	
		int randomroll=0;
		
		Random number = new Random();
		
		randomroll = number.nextInt(8);
		
		if (randomroll == 0) {
			JOptionPane.showMessageDialog(null, "Yes!");
		}
		else if (randomroll == 1) {
			JOptionPane.showMessageDialog(null, "No.");
		}
		else if (randomroll == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		else if (randomroll == 3) {
			JOptionPane.showMessageDialog(null, "When pigs fly.");
		}
		else if (randomroll == 4) {
			JOptionPane.showMessageDialog(null, "This is going to happen-- no doubt.");
		}
		else if (randomroll == 5) {
			JOptionPane.showMessageDialog(null, "As if!");
		}
		else if (randomroll == 6) {
			JOptionPane.showMessageDialog(null, "In your dreams!");
		}
		else if (randomroll == 7) {
			JOptionPane.showMessageDialog(null, "This is a guaruntee.");
		}
		else if (randomroll == 7) {
			JOptionPane.showMessageDialog(null, "Fat chance.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	// 2. Get the user to enter a question for the 8 ball to answer
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	
	// 4. If the random number is 0

	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
