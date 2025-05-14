package de.teelekom.coffeerating.graphics;

import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StartPage extends JFrame{
	
	
	private JPanel cardPanel;
	private CardLayout cardLayout;
	private LoginPanel lgPage;
	
	
	// Das hier ist die Hauptseite des Programms
	private MainFrame mainFrame;
	
	public StartPage() {
		lgPage = new LoginPanel();
		mainFrame = new MainFrame();
		
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		cardPanel.add(lgPage, "Page1");
		cardPanel.add(mainFrame, "Page2");
		add(cardPanel);
		
		setTitle("CoffeeRating - Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 800);
		
		setVisible(true);
		setResizable(false);
		
	}



	public CardLayout getCardLayout() {
		return cardLayout;
	}
	public JPanel getCardPanel() {
		return cardPanel;
	}
	public MainFrame getMf() {
		return mainFrame;
	}
	public LoginPanel getLgPage() {
		return lgPage;
	}
}
