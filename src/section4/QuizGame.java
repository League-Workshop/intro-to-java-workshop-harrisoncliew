package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score
		int score = 0;
		
		// 2.  Ask the user a question
		String answer = JOptionPane.showInputDialog("What is 35+28?");
		
		
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equals("63")) {
			JOptionPane.showMessageDialog(null, "Correct"); 
			score++; JOptionPane.showMessageDialog(null, "Your score is 1.");
		} else { score--; JOptionPane.showMessageDialog(null, "Your score is "+score+".");}
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below.
				String cool = JOptionPane.showInputDialog("What is 66*4?");
				if(cool.equals("264")){
					score++; JOptionPane.showMessageDialog(null, "Your score is "+score+".");
				} else { 
					score--; JOptionPane.showMessageDialog(null, "Your score is "+score+".");
				}
				
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
