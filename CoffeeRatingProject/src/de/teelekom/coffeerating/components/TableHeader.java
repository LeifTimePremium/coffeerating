/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.teelekom.coffeerating.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deter
 */
public class TableHeader extends JLabel {
    
    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(new Color(38,107,150));
        setFont(new Font("sansserif", 1 , 12));
        setForeground(Color.WHITE);
        setBorder(new EmptyBorder(10,5,10,5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(new Color(22,105,122));
        g.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
        
        
    }
    
}
