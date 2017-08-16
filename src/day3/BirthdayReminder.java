package day3;
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 21st";
		String dadsBirthday = "May 24th";
		String myBirthday = "April 26th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog("Who's birthday do you want? (Just type Mom, Dad, or Mine)");
	  
		// 3. Print out what the user typed
		
		
		// 4. if user asked for "mom"
		if(birthday.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "Mom's Birthday is September 21st");
		}
		if(birthday.equals("Dad")){
			JOptionPane.showMessageDialog(null,"Dad's Birthday is May 24th");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if(birthday.equals("Mine")) {
			JOptionPane.showMessageDialog(null, "My Birthday is April 26th");
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
