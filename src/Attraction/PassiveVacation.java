package Attraction;
/**
 * This class represents a passive vacation.
 * It implements the Vacation interface and provides a method for planning the vacation based on the selected country.
 */
public class PassiveVacation implements Vacation{
    /**
     * Plans a passive vacation based on the selected country.
     * If the country is Sweden, Norway, Greece, Italy, Bulgaria, Albania, Germany, or Ireland, the method will print information about places to visit and national cuisines to try.
     * If the country is not one of these, the method will not print anything.
     * @param country the country to plan the vacation for
     */
    @Override
    public void plan(String country) {
        System.out.println("Planning a passive vacation...");
        if (country.equals("Sweden")) {
            System.out.println("You selected Sweden for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Stockholm's old town");
            System.out.println("- Visby's medieval walls");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Smörgåsbord (buffet with a variety of dishes)");
            System.out.println("- Toast Skagen (shrimp salad on toast)");
        } else if (country.equals("Norway")) {
            System.out.println("You selected Norway for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Bergen's waterfront");
            System.out.println("- Oslo's museums and parks");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Fiskeboller (fish balls in white sauce)");
            System.out.println("- Kjøttkaker (meatballs)");
        } else if (country.equals("Greece")) {
            System.out.println("You selected Greece for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Santorini's white-washed buildings");
            System.out.println("- Athens' ancient landmarks");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Tzatziki (yogurt and cucumber dip)");
            System.out.println("- Moussaka (layered eggplant dish)");

        } else if (country.equals("Italy")) {
            System.out.println("You selected Italy for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Venice's canals");
            System.out.println("- Florence's art and architecture");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Bruschetta (toasted bread with toppings)");
            System.out.println("- Risotto (rice dish)");
        } else if (country.equals("Bulgaria")) {
            System.out.println("You selected Bulgaria for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Sofia's ancient and modern sites");
            System.out.println("- Rila Monastery's stunning frescoes");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Banitsa (pastry with cheese and eggs)");
            System.out.println("- Shopska salad (vegetable salad with feta cheese)");
        } else if (country.equals("Albania")) {
            System.out.println("You selected Albania for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Berat's Ottoman architecture");
            System.out.println("- Albanian Alps' natural beauty");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Byrek (pastry with meat or cheese filling)");
            System.out.println("- Tave Kosi (baked lamb and yogurt casserole)");
        } else if (country.equals("Germany")) {
            System.out.println("You selected Germany for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Berlin's history and culture");
            System.out.println("- Bavarian Alps' scenic beauty");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Schnitzel (breaded meat dish)");
            System.out.println("- Sauerkraut (fermented cabbage)");
        } else if (country.equals("Ireland")) {
            System.out.println("You selected Ireland for your passive vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Dublin's pubs and museums");
            System.out.println("- Cliffs of Moher's breathtaking views");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Irish stew");
            System.out.println("- Boxty (potato pancake)");
        }
    }
}
