package Country;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**

 The Countries class represents a collection of Country objects and provides methods for filtering them based on climate and food.
 */
public class Countries {
    /**
     * Creates a list of Country objects and filters them based on their climate and food.
     */
  public void countries()
  {
      List<Country> countries = new ArrayList<>();
      countries.add(new Country("Hot", "Pizza"));
      countries.add(new Country("Cold", "Salmon"));
      countries.add(new Country("Temperate", "Sushi"));
      countries.add(new Country("Cold", "Meatballs"));
      countries.add(new Country("Hot", "Curry"));
      System.out.println("List of all countries: ");
      countries.forEach(c -> System.out.println("Climate: " + c.getClimate() + ", Food: " + c.getFood()));

      // Filter list of countries by food type using lambda expression
      System.out.println("\nList of cold countries that serve meatballs:");
      Predicate<Country> isCold = c -> c.getClimate().equals("Cold");
      Predicate<Country> servesMeatballs = c -> c.getFood().equals("Meatballs");
      countries.stream()
              .filter(isCold.and(servesMeatballs))
              .forEach(c -> System.out.println("Climate: " + c.getClimate() + ", Food: " + c.getFood()));
  }
  }




