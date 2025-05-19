/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.teelekom.coffeerating.util;

/**
 *
 * @author deter
 */
public class Item {
    
    private String name;
    private String type;
    private int calories;
    private double caffeine;
    private String allergyInfo;
    
    public Item(String name, String type, int calories, double caffeine, String allergyInfo) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.caffeine = caffeine;
        this.allergyInfo = allergyInfo;
    }
    
    
    public String getName() { return name; }
    public String getType() { return type; }
    public int getCalories() { return calories; }
    public double getCaffeine() { return caffeine; }
    public String getAllergyInfo() { return allergyInfo; }

    @Override
    public String toString() {
        return "Item{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", calories=" + calories +
               ", caffeine=" + caffeine +
               ", allergyInfo='" + allergyInfo + '\'' +
               '}';
    }
}
