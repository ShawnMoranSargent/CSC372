package GridLayout;

import java.awt.*;

import javax.swing.*;

public class GridExample {
	
	public static void main(String[] args){
		JFrame FunFrame = new JFrame();
		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 400;
		
		GridLayout FunLayout = new GridLayout(2, 3); // 2 rows 3 columns
		FunFrame.setLayout(FunLayout);
		
		FunFrame.add(new JButton("Button 1"));
		FunFrame.add(new JButton("Button 2"));
		FunFrame.add(new JButton("Button 3"));
		FunFrame.add(new JButton("Button 4"));
		
		FunFrame.setVisible(true);

		FunFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		FunFrame.setTitle("Fun Example");
		FunFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FunFrame.setVisible(true);
	}
}
