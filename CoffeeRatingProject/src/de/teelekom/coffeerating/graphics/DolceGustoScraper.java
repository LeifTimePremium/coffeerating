package de.teelekom.coffeerating.graphics;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
//jar datei fehlt noch für maven bib deswegen jsoup fehlerhaft
public class DolceGustoScraper {
    public static void main(String[] args) {
        String url = "https://www.dolce-gusto.de/kapseln";

        try {
            
            Document doc = Jsoup.connect(url).get();

            
            Elements products = doc.select(".product-tile"); 

            for (Element product : products) {
                String name = product.select(".product-name").text();
                String price = product.select(".product-price").text();
                String imageUrl = product.select(".product-image img").attr("src");
                String capsuleCount = product.select(".capsule-count").text();

                System.out.println("Name: " + name);
                System.out.println("Preis: " + price);
                System.out.println("Bild-URL: " + imageUrl);
                System.out.println("Kapselanzahl: " + capsuleCount);
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
