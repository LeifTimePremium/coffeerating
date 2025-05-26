package de.teelekom.coffeerating.main;

import de.teelekom.coffeerating.graphics.StartPage;
import de.teelekom.coffeerating.graphics.MainFrame;
import de.teelekom.coffeerating.util.ConfigManager;

public class Main {
    public static StartPage frame;
    public static ConfigManager cm = new ConfigManager();
    
	public static void main(String[] args) {
		frame = new StartPage();
	}

 
        
}


