package Booking;

import java.util.Scanner;

/**
 * The `BookingHotel` class handles the booking of accommodations for a user's vacation.
 * It uses an `AccommodationStrategy` object to determine the accommodation name and to book it.
 */
public class BookingHotel {
    Scanner scanner = new Scanner(System.in);
    private AccommodationStrategy accommodationStrategy;
    /**
     * Constructs a new `BookingHotel` object with the specified `AccommodationStrategy`.
     *
     * @param accommodationStrategy the `AccommodationStrategy` object to use for booking accommodations.
     */
    public BookingHotel(AccommodationStrategy accommodationStrategy) {
        this.accommodationStrategy = accommodationStrategy;
    }
    /**
     * Asks the user for their budget for the vacation.
     *
     * @return the user's budget as a String.
     */
    protected String askForBudget() {
        System.out.println("What is your budget for vacation: \n 500-1000$  1500-2000$ 5000-7500$");
        String amount = scanner.next();
        return amount;
    }
    /**
     * Books an accommodation for the given country based on the accommodation strategy.
     *
     * @param country the country for which the accommodation needs to be booked.
     * @return the name of the booked accommodation as a String.
     */
    public String bookAccommodation(String country) {
        String accommodationName = accommodationStrategy.getAccommodationName(country);

        return accommodationName;
    }

}