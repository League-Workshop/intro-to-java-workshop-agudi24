package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		

	
	// 4. repeat steps 2 and 3 a lot of times
	for (int i = 0; i < 20; i++) {
		String sentence = JOptionPane.showInputDialog("Say Something");
		
		speak(sentence);
	}
	}
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
