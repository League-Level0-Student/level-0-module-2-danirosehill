package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterty {
	
	public static void main(String[] args) {
		
	int firstnum = 0;
	Random lotto = new Random();
	firstnum= lotto.nextInt(99 - 1) + 1;
	
	int secnum = 0;
	secnum= lotto.nextInt(99 - 1) + 1;
	
	int thirdnum= 0;
	thirdnum= lotto.nextInt(99 - 1) + 1;
	
	int fourthnum= 0;
	fourthnum= lotto.nextInt(99 - 1) + 1;
	
	int fifthnum= 0;
	fifthnum= lotto.nextInt(99 - 1) + 1;
	
	JOptionPane.showMessageDialog(null, firstnum + " " + secnum + " " + thirdnum + " " + fourthnum + " " + fifthnum);
	
}
}