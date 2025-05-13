package de.teelekom.coffeerating.graphics;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CoffeeBreakButton extends JButton {

	public CoffeeBreakButton() {
		super("Coffebreak");
		addActionListener(e -> 
        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this), "Coffeebreak!!!")
    );
	}
	
	
}
