package Booking;

public class Hotel implements AccommodationStrategy{
    /**
     * Returns the name of the accommodation based on the country.
     *
     * @param country the name of the country
     * @return the name of the accommodation
     */
    public String getAccommodationName(String country) {
        if (country.equals("Sweden")) {
            return "Grand Hotel Stockholm";
        } else if (country.equals("Norway")) {
            return "The Thief in Oslo";
        } else if (country.equals("Greece")) {
            return "Amanzoe in Porto Heli";
        } else if (country.equals("Italy")) {
            return "Hotel Hassler Roma in Rome";
        } else if (country.equals("Bulgaria")) {
            return "Grand Hotel Pomorie";
        } else if (country.equals("Albania")) {
            return "Hotel Butrinti in Saranda";
        } else if (country.equals("Germany")) {
            return "Hotel Adlon Kempinski in Berlin";
        } else if (country.equals("Ireland")) {
            return "The Merrion Hotel in Dublin";
        }
        return "";
    }

/**
        * Books the accommodation based on the country.
 *
         * @param country the name of the country
 */

    @Override
    public void bookAccommodation(String country)
    {}

}
