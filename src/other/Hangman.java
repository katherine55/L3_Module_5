package other;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman implements KeyListener {

	JFrame myFrame;
	JPanel myPanel;
	JLabel myLabel;
	Stack<String> puzzles = new Stack<String>();
	String labeltext = "";
	String newtext = "";
	String answer = "";

	public static void main(String[] args) {
		Hangman jerry = new Hangman();
		jerry.createUI();
		jerry.addPuzzles();
	}

	void createUI() {
		myFrame = new JFrame("Hangman");
		myPanel = new JPanel();
		myLabel = new JLabel();
		myLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		myPanel.add(myLabel);
		myFrame.add(myPanel);
		myFrame.setVisible(true);

		myFrame.addKeyListener(this);

	}

	void addPuzzles() {
		puzzles.add("sheep");
		puzzles.add("electric");
		puzzles.add("dream");
		puzzles.add("androids");

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

@Override
public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_ENTER) {
			labeltext = "";
		int length = puzzles.lastElement().length();
		answer = puzzles.pop();
		for(int i = 0; i < length; i++) {
			labeltext += "_ ";
		}
		myLabel.setText(labeltext);
	}
		for(int i = 0; i < answer.length(); i++) {
			if(answer.charAt(i) == e.getKeyChar()) {
				newtext+=e.getKeyChar()+ " ";
			}
			else {newtext+="_ ";}
			myLabel.setText(newtext);
		}
		
}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
