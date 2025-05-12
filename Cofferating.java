import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeRatingApp {

    // Klasse für eine einzelne Bewertung
    static class CoffeeRating {
        String coffeeType;
        int rating;

        public CoffeeRating(String coffeeType, int rating) {
            this.coffeeType = coffeeType;
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "Kaffeesorte: " + coffeeType + ", Bewertung: " + rating + "/10";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CoffeeRating> ratings = new ArrayList<>();

        System.out.println("Willkommen beim Kaffee-Bewertungsprogramm!");

        boolean weiter = true;
        while (weiter) {
            System.out.print("Gib die Kaffeesorte ein: ");
            String sorte = scanner.nextLine();

            int bewertung = 0;
            while (true) {
                System.out.print("Gib deine Bewertung von 1 bis 10 ein: ");
                try {
                    bewertung = Integer.parseInt(scanner.nextLine());
                    if (bewertung >= 1 && bewertung <= 10) {
                        break;
                    } else {
                        System.out.println("Bitte gib eine Zahl zwischen 1 und 10 ein.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ungültige Eingabe. Bitte gib eine Zahl ein.");
                }
            }

            ratings.add(new CoffeeRating(sorte, bewertung));

            System.out.print("Weitere Bewertung hinzufügen? (j/n): ");
            String antwort = scanner.nextLine().toLowerCase();
            if (!antwort.equals("j")) {
                weiter = false;
            }
        }

        System.out.println("\nAlle Bewertungen:");
        for (CoffeeRating r : ratings) {
            System.out.println(r);
        }

        scanner.close();
    }
}
