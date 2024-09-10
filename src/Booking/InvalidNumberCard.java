package Booking;



/**

 Exception for invalid id card number.
 */

public class InvalidNumberCard extends Exception
{
    /**
     * Constructs an InvalidNumberCard with the specified detail message.
     *
     * @param message the detail message
     */
    public InvalidNumberCard(String message) {
        super(message);
    }

}
