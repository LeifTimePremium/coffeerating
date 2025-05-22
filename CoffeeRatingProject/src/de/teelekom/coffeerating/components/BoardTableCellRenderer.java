/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.teelekom.coffeerating.components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author deter
 */
public class BoardTableCellRenderer extends DefaultTableCellRenderer {
private static final long serialVersionUID = 1L;

    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int col) {

        // den Standard-Renderer holen
        JLabel c = (JLabel) super.getTableCellRendererComponent(
            table, value, isSelected, hasFocus, row, col);

        // Schriftfarbe
        c.setForeground(Color.BLACK);

        // Text mittig ausrichten
        c.setHorizontalAlignment(SwingConstants.CENTER);
        // falls du auch vertikal zentrieren möchtest:
        c.setVerticalAlignment(SwingConstants.CENTER);

        return c;
    }
}
