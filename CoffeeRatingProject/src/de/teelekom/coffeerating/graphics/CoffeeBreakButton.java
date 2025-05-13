package de.teelekom.coffeerating.graphics;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CoffeeBreakButton extends JButton {

	public CoffeeBreakButton() {
		
		addActionListener(e -> 
        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this), "Coffeebreak!!!")
    );
		setBounds(450, 300, 100, 50);
		setText("Coffeebreak!");
		
	}
	
	
	
}
