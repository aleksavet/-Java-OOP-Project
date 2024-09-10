package Booking;
/**

 This exception is thrown when an invalid email address is provided.
 */
public class InvalidEmailException extends Exception {
    /**
     * Constructs an InvalidEmailException with the specified detail message.
     *
     * @param emailAddressIsIncorrect the detail message.
     */

    public InvalidEmailException(String emailAddressIsIncorrect)
    {
        super(emailAddressIsIncorrect);
    }
}
