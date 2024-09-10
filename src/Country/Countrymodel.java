package Country;
import Booking.BookingTicket;


import java.util.Objects;
import java.util.Scanner;
/**
 * A class that contains a method to sort countries based on climate and food preference
 * and a method to book tickets for the suggested countries.
 */
public class Countrymodel {
    BookingTicket booking = new BookingTicket();
    Scanner scanner = new Scanner(System.in);
    public Countrymodel() {}
    String result = "";
    /**
     * Sorts countries based on climate and food preference, and returns a string
     * containing the names of the two suggested countries.
     *
     * @param climate the preferred climate of the user
     * @param food the preferred food of the user
     * @return a string containing the names of the two suggested countries
     * @throws IllegalArgumentException if climate or food is null
     * @throws IllegalStateException if no matching countries are found
     *
     * @see Country
     * @see ColdCountry
     * @see WarmCountry
     */
    public String sorting(String climate, String food) {

        Country Sweden = new ColdCountry("Light"); //inheritance
        Country Norway = new ColdCountry("Light");
        Country Ireland = new ColdCountry("Heavy");
        Country Germany = new ColdCountry("Heavy");
        Country Greece = new WarmCountry("Light");
        Country Italy = new WarmCountry("Light");
        Country Bulgaria = new WarmCountry("Heavy");
        Country Albania = new WarmCountry("Heavy");

        if (climate.equals(Sweden.getClimate()) && food.equals(Norway.getFood())) {
            result= "Sweden,Norway";
        }
        else if (climate.equals(Ireland.getClimate()) && food.equals(Germany.getFood())) {
            result="Ireland,Germany";
        }
        else if (climate.equals(Greece.getClimate()) && food.equals(Italy.getFood())) {
            result = "Greece,Italy";
        }
        else if (climate.equals(Bulgaria.getClimate()) && food.equals(Albania.getFood())) {
            result = "Bulgaria,Albania";
        }
        else {
            System.out.println("No matching countries found");
        }
        next();
    return result;
    }  /**
     * Prompts the user to book a ticket for the suggested countries.
     *
     * @throws IllegalStateException if no countries were suggested yet
     *
     * @see BookingTicket#booking(String)
     */
    public void next() {
        if (Objects.equals(result, "Sweden,Norway"))
        {
            System.out.println("Based on your answers we suggest you these two countries: Sweden and Norway\n press 's' if you choose Sweden or 'n' for Norway");
            String butt = scanner.nextLine();
            if(Objects.equals(butt, "s"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Sweden, a land of enchanting forests, crystal-clear lakes, and vibrant cities.\nImmerse yourself in the Swedish way of life by exploring the country's stunning natural landscapes\nand experiencing its unique culture.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Sweden");
                }
             }
            else if(Objects.equals(butt, "n"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Norway, a land of majestic fjords, rugged mountains, and vibrant cities.\nImmerse yourself in the breathtaking natural beauty and rich cultural heritage of this Nordic paradise.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Norway");
                }

            }
        }
        else if(Objects.equals(result, "Ireland,Germany"))
        {
            System.out.println("Based on your answers we suggest you these two countries: Ireland and Germany\n press 'i' if you choose Ireland or 'g' for Germany");
            String butt = scanner.nextLine();
            if(Objects.equals(butt, "i"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Ireland, the Emerald Isle, a land of rolling hills, rugged coastline, and vibrant culture.\nImmerse yourself in the charm and hospitality of the Irish people, and discover the rich\nhistory and natural beauty of this stunning country.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Ireland");
                }
            }
            else if(Objects.equals(butt, "g"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Germany, a land of rich history, vibrant culture, and stunning natural beauty.\nFrom the bustling cities of Berlin and Munich to the picturesque countryside of the Black Forest\nand Bavaria, there's something for everyone in this diverse and fascinating country.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Germany");
                }
            }

        } else if (Objects.equals(result, "Greece,Italy")) {
            System.out.println("Based on your answers we suggest you these two countries: Greece and Italy\n press 'g' if you choose Greece or 'i' for Italy");
            String butt = scanner.nextLine();
            if(Objects.equals(butt, "g"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Greece, a land of ancient history, stunning beaches, and delicious cuisine.\nImmerse yourself in the Mediterranean lifestyle, and discover the charm and\nhospitality of the Greek people.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Greece");
                }
            }
            else if(Objects.equals(butt, "i"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Italy, a land of history, culture, and gastronomy. From the romantic \ncanals of Venice to the ancient ruins of Rome, this country offers a wealth \nof experiences for every type of traveler.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Italy");
                }
            }
        }
        else {
            System.out.println("Based on your answers we suggest you these two countries: Bulgaria and Albania\n press 'b' if you choose Bulgaria or 'a' for Albania");
            String butt = scanner.nextLine();
            if(Objects.equals(butt, "b"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Bulgaria, a land of breathtaking natural beauty, rich culture, and warm hospitality.\nDiscover the stunning beaches along the Black Sea coast, explore the picturesque mountain\nlandscapes, or wander through the charming towns and villages.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Bulgaria");
                }
            }
            else if(Objects.equals(butt, "a"))
            {
                System.out.println("Great choice!!!\n\nWelcome to Albania, a hidden gem in the heart of the Balkans, with stunning beaches, rugged\nmountains, and a rich history and culture. Discover the unspoiled beauty of the Albanian Riviera,\nwith its turquoise waters and white sandy beaches, or explore the rugged peaks of the Albanian Alps.");
                System.out.println("\nFor booking ticket press 'b'");
                String b=scanner.nextLine();
                if(Objects.equals(b, "b"))
                {
                    booking.booking("Albania");
                }
            }
        }
    }

}
