package de.teelekom.coffeerating.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class LoginButton extends JButton implements ActionListener{

	public LoginButton() {
		super("Login");
		setBounds(425, 300, 100, 30);
		setFocusable(false);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			if(btn.getText() == "Login") {
				
				LoginPage frame = (LoginPage) SwingUtilities.getWindowAncestor(btn);
				String username = frame.getUserName().getText();
				String password = String.valueOf(frame.getPassword().getPassword());
				System.out.println("Username: " + username);
				System.out.println("Password: " + password);
				
				//TODO: Database creation + JDBC Connection, check username and password
				
				
				
				
			}
		
		
	}
	
}
}
