package Attraction;
/**
 * Represents an active vacation destination and provides information about activities and cuisines to try in different countries.
 */
public class ActiveVacation implements Vacation
{

    /**
     * Provides information about activities and cuisines to try in the specified country.
     *
     * @param country the country for which to plan an active vacation
     */
    @Override
    public void plan(String country) {

        System.out.println("Planning an active vacation...");
        if (country.equals("Sweden")) {
            System.out.println("You selected Sweden for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Abisko National Park");
            System.out.println("- Dog sledding in Lapland");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Swedish meatballs");
            System.out.println("- Pickled herring");
        } else if (country.equals("Norway")) {
            System.out.println("You selected Norway for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Trolltunga");
            System.out.println("- Kayaking in the Geirangerfjord");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Fårikål (lamb stew)");
            System.out.println("- Gravlaks (cured salmon)");
        } else if (country.equals("Greece")) {
            System.out.println("You selected Greece for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Samaria Gorge");
            System.out.println("- Windsurfing in the Aegean Sea");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Moussaka (layered eggplant dish)");
            System.out.println("- Spanakopita (spinach and feta pie)");
        } else if (country.equals("Italy")) {
            System.out.println("You selected Italy for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Cinque Terre");
            System.out.println("- Cycling in Tuscany");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Pizza");
            System.out.println("- Gelato");
        } else if (country.equals("Bulgaria")) {
            System.out.println("You selected Bulgaria for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Rila Mountains");
            System.out.println("- Horseback riding in the Rhodope Mountains");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Banitsa (cheese-filled pastry)");
            System.out.println("- Kavarma (stew with meat and vegetables)");
        } else if (country.equals("Albania")) {
            System.out.println("You selected Albania for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Valbona Valley National Park");
            System.out.println("- Rafting in the Vjosa River");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Tavë kosi (baked lamb and rice with yogurt)");
            System.out.println("- Byrek (savory pastry filled with cheese, spinach, or meat)");
        } else if (country.equals("Germany")) {
            System.out.println("You selected Germany for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Bavarian Alps");
            System.out.println("- Biking along the Romantic Road");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Currywurst (sausage with curry sauce)");
            System.out.println("- Schnitzel (breaded meat cutlet)");
        } else if (country.equals("Ireland")) {
            System.out.println("You selected Ireland for your active vacation.");
            System.out.println("Here are some places you can visit:");
            System.out.println("- Hiking in the Wicklow Mountains");
            System.out.println("- Surfing in Bundoran");
            System.out.println("And here are some national cuisines to try:");
            System.out.println("- Irish stew");
            System.out.println("- Boxty (potato pancake)");
        }

    }
}
