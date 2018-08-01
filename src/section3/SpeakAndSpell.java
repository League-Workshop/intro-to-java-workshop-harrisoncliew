package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell Australia");

		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog(null);

		// 3. If the user spelled the word correctly, speak "correct"
		if (answer.equals("Australia")) {
			speak("correct");
		} else {
			speak("you are horrible at this");
		}

	

	// 4. Otherwise say "wrong"

	// 5. repeat the process for other words
	speak("Spell Mandlebrot");
	
	String correct = JOptionPane.showInputDialog(null);
			if(correct.equalsIgnoreCase("mandlebrot")){
				speak(correct);
			} else {
				speak("why are you so bad at this easy thing, human!");
			}
	}
			

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
