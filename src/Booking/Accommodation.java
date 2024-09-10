package Booking;
/**
 * The strategy object that this accommodation uses to book accommodations.
 */
public class Accommodation {
    private AccommodationStrategy accommodationStrategy;
    /**
     * Sets the accommodation strategy for this accommodation.
     *
     * @param accommodationStrategy the strategy object to use for booking accommodations
     */
    protected void setAccommodationStrategy(AccommodationStrategy accommodationStrategy)
    {
        this.accommodationStrategy = accommodationStrategy;
    }
    /**
     * Books an accommodation in the specified country using the set accommodation strategy.
     *
     * @param country the country to book an accommodation in
     *
     * @see AccommodationStrategy
     */
    protected void bookAccommodation(String country)
    {
        accommodationStrategy.bookAccommodation(country);
    }
}
