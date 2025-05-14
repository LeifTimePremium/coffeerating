package de.teelekom.coffeerating.graphics;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{

	private LoginButton loginBtn;
	private JTextField userName;
	private JPasswordField password;
	private JLabel userNameLabel;
	private JLabel passwordLabel;
	private JLabel messageLabel;
	
	public LoginPanel() {
		
		
		loginBtn = new LoginButton();
		userName = new JTextField();
		password = new JPasswordField();
		userNameLabel = new JLabel("Username:");
		passwordLabel = new JLabel("Password:");
		messageLabel = new JLabel();
		
		userNameLabel.setBounds(300, 200, 75, 25);
		passwordLabel.setBounds(300, 250, 75, 25);
		messageLabel.setBounds(300, 400, 600, 35);
		messageLabel.setFont(new Font(null, Font.ITALIC, 25));
		userName.setBounds(375, 200, 200, 25);
		password.setBounds(375, 250, 200, 25);
		
		
		add(loginBtn);
		add(password);
		add(userName);
		add(messageLabel);
		add(userNameLabel);
		add(passwordLabel);
		
		setLayout(null);
	}

	public LoginButton getLoginBtn() {
		return loginBtn;
	}



	public JTextField getUserName() {
		return userName;
	}



	public JPasswordField getPassword() {
		return password;
	}



	public JLabel getUserNameLabel() {
		return userNameLabel;
	}



	public JLabel getPasswordLabel() {
		return passwordLabel;
	}



	public JLabel getMessageLabel() {
		return messageLabel;
	}
}
