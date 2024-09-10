package Booking;/**

 The AccommodationStrategy interface represents the strategy for booking accommodations for a specific country.
 It defines two methods: getAccommodationName and bookAccommodation.

 */

public interface AccommodationStrategy
{/**
 * Returns the name of the accommodation for a given country.
 *
 * @param country the name of the country to get the accommodation name for.
 * @return a string representing the name of the accommodation.
 */
     String getAccommodationName(String country);
     /**
      * Books the accommodation for a given country.
      *
      * @param country the name of the country to book the accommodation for.
      */
     void bookAccommodation(String country);


}
