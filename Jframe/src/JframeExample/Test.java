package JframeExample;

// import for JFrame
import javax.swing.*;

import java.awt.*;
// import for JPaNEL
import java.awt.event.*;


public class Test {

	
	public static void main(String[] args) {
	// MAKING FRAME
	JFrame newFrame = new JFrame();
	final int F_WIDTH = 300;
	final int F_HEIGHT = 500;
	
	
	// USING PANEL TO MAKE LABELS AND BUTTONS
	JLabel excitedLabel = new JLabel("This IS A SCARY LABEL");
	JButton excitedButton = new JButton("excited BUTTON");
	JButton amusedButton = new JButton("amused button");
	JButton justaButton = new JButton("Just a button");
	
	JPanel newPanel = new JPanel();
	
	newPanel.add(excitedLabel);
	newPanel.add(excitedButton);
	newPanel.add(amusedButton);
	newPanel.add(justaButton);
	
	newPanel.setBackground(Color.cyan);
	
	newFrame.add(newPanel);
	
	newFrame.setSize(F_WIDTH, F_HEIGHT);
	newFrame.setTitle("I am cool because I have a title");
	newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	newFrame.setVisible(true);
	
	
	
	}
}
