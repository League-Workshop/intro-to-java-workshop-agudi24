package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your Name?");
		String phone = JOptionPane.showInputDialog("What is your phone number?");
		String ccnumber = JOptionPane.showInputDialog("What is your credit card number?");
		String ssnumber = JOptionPane.showInputDialog("What is your Social Security Number?");
		JOptionPane.showMessageDialog(null, "Thanks for the info " + name + ". A scammer will steal your money from the number, " + ccnumber + ", in 20 minutes.");
		
		
		
	}

	
	}

