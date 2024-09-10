package TravelTrove;

import Country.Countrymodel;

import java.util.Objects;
import java.util.Scanner;

/**

 The Questionnaire class represents a questionnaire for the TravelTrove application.
 It prompts the user to answer a series of questions about their travel preferences and generates a list of countries based on their answers.
 @author [Your Name]
 @version 1.0
 @see Countrymodel
 */
public class Questionnaire {
    private String climate;

    private String food;

    Scanner scanner = new Scanner(System.in);
    Countrymodel countrymodel = new Countrymodel(); //inheritance

    /**
     * Starts the questionnaire by prompting the user to enter "S" to begin the questionnaire.
     * If the user enters "S", the answer1 method is called.
     */
    public void start() {
        System.out.println("Welcome to app TravelTrove\n press 'S' to start planning your trip");
        String start = scanner.nextLine();

        if (Objects.equals(start, "S")) {
            answer1();
        }

    }

    /**
     * Prompts the user to answer the first question about their climate preference.
     * If the user enters "w", the climate variable is set to "Warm" and answer2 method is called.
     * If the user enters "c", the climate variable is set to "Cold" and the answer2 method is called.
     */
    public void answer1() {

        System.out.println("What type of climate do you prefer?");
        System.out.println("Warm or Cold?");
        System.out.println("Press 'w' for warm and 'c' for cold");
        String butt = scanner.nextLine();
        if (Objects.equals(butt, "w")) {
            climate = "Warm";
            answer2();
        } else if(Objects.equals(butt,"c")){
            climate = "Cold";
            answer2();
        }
    }
    /**
     * Prompts the user to answer the second question about their food preference.
     * If the user enters "h", the food variable is set to "Heavy" and the generate method is called.
     * If the user enters "l", the food variable is set to "Light" and the generate method is called.
     */
    public void answer2() {
        System.out.println("What kind of food do you like?\n Heavy or Light\n Press 'h' for heavy and 'l' for light");
        String butt = scanner.nextLine();
        if (Objects.equals(butt, "h")) {
            food = "Heavy";
            generate();
        } else if (Objects.equals(butt, "l")){
            food = "Light";
            generate();
        }
    }
    /**
     * Generates a list of countries based on the user's climate and food preferences.
     * Prints a progress bar as the list is being generated.
     * Once the list is generated, the countries are sorted using the Countrymodel class.
     */

    public void generate() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Generating countries: [");
                for (int i = 0; i < 50; i++) {
                    System.out.print(" ");
                }
                System.out.print("]");
                for (int i = 0; i <= 100; i++) {
                    System.out.print("\rGenerating countries: [");
                    for (int j = 0; j < i / 2; j++) {
                        System.out.print("=");
                    }
                    System.out.print(">");
                    for (int j = i / 2 + 1; j <= 50; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("] " + i + "%");
                    try {
                        Thread.sleep(42);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\nDone!");
                countrymodel.sorting(climate,food);
            }
        });
        t.start();
    }

}
