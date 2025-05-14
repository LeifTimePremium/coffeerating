package de.teelekom.coffeerating.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import de.teelekom.coffeerating.util.JDBCOperator;

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
				
				StartPage frame = (StartPage) SwingUtilities.getWindowAncestor(btn);
				String username = frame.getLgPage().getUserName().getText();
				String password = String.valueOf(frame.getLgPage().getPassword().getPassword());
				
				
				JDBCOperator operator = new JDBCOperator();
				
				//Checking if username and password are in SQL-Table
				boolean pwCorrect = operator.checkUsernamePasswordCombination(username, password);
				System.out.println(pwCorrect);
				if(pwCorrect) {
					frame.getCardLayout().show(frame.getCardPanel(), "Page2");
				} else {
					frame.getLgPage().getMessageLabel().setText("Nutzername oder Passwort falsch");
				}
			
			}
		
		
	}
	
}
}
