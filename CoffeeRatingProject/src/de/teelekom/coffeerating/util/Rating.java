/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.teelekom.coffeerating.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;
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
    
    
    public static ArrayList<Rating> filterRatingData(RatingEnum ratingEnumFilter, ArrayList<Rating> ratings) {
        ArrayList<Rating> returner = ratings;
        switch(ratingEnumFilter) {
            case TASTE:
                returner.sort(Comparator.comparingDouble(r -> Double.parseDouble(r.getTaste())));
            break;
            
            case PRICE:
                returner.sort(Comparator.comparingInt(r -> Integer.parseInt(r.getPrice())));
            break;
            
            case PRICE_PERFORMANCE:
                returner.sort(Comparator.comparingDouble(r -> Double.parseDouble(r.getPricePerformance())));
                
            break;
            
            case TOTAL_RATING:
                returner.sort(Comparator.comparingDouble(r -> Double.parseDouble(r.getTotalRating())));
            break;
            
        }
        return returner;
    }
}
