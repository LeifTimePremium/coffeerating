package de.teelekom.coffeerating.graphics;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		setTitle("CoffeeRating");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 800);
		CoffeeBreakButton btn = new CoffeeBreakButton();
		add(btn);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	
}
