/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.teelekom.coffeerating.util;

/**
 *
 * @author deter
 */
public class Rating {
    
    
    private String name;
    private String taste;
    private String price;
    private String pricePerformance;
    private String comment;
    private String totalRating;
    
    
    public Rating(String name, String taste, String price, String pricePerformance, String comment, String totalRating) {
        this.name = name;
        this.taste = taste;
        this.price = price;
        this.pricePerformance = pricePerformance;
        this.comment = comment;
        this.totalRating = totalRating;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public String getPrice() {
        return price;
    }

    public String getPricePerformance() {
        return pricePerformance;
    }

    public String getComment() {
        return comment;
    }

    public String getTotalRating() {
        return totalRating;
    }
    
    
}
