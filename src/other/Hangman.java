package other;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.BorderFactory;
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
	JLabel lives = new JLabel();
	int counter = 9;

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
		lives.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
		myPanel.add(myLabel);
		myPanel.add(lives);
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
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			labeltext = "";
			lives.setText(""+counter);
			int length = puzzles.lastElement().length();
			answer = puzzles.pop();
			for (int i = 0; i < length; i++) {
				labeltext += "-";
			}
			myLabel.setText(labeltext);
		}

		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == e.getKeyChar()) {
			labeltext = labeltext.substring(0, i) + e.getKeyChar() + labeltext.substring(i+1, answer.length());
			System.out.println("Yay!");
			} else {
				counter--;
				lives.setText(""+counter);
				myLabel.setText(labeltext);
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
