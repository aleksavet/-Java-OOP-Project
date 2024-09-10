package Booking;
/**
 * Represents a house rental accommodation strategy.
 */
public class House_rent implements AccommodationStrategy{
    /**
     * Returns the name of the accommodation based on the country.
     *
     * @param country the name of the country
     * @return the name of the accommodation
     */
    public String getAccommodationName(String country) {
        if (country.equals("Sweden")) {
            return "Skogsstuga Retreat";
        } else if (country.equals("Norway")) {
            return "Fjordview Chalet";
        } else if (country.equals("Greece")) {
            return "Aegean View Villa";
        } else if (country.equals("Italy")) {
            return "Tuscan Villa";
        } else if (country.equals("Bulgaria")) {
            return "Balkan Mountain Lodge";
        } else if (country.equals("Albania")) {
            return "Ionian Coast House";
        } else if (country.equals("Germany")) {
            return "Bavarian Chalet";
        } else if (country.equals("Ireland")) {
            return "Emerald Isle Cottage";
        }
        return "";
    }/**
     * Books the accommodation based on the country.
     *
     * @param country the name of the country
     */
    @Override
    public void bookAccommodation(String country)
    {}


}
