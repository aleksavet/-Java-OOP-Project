package Booking;
/**

 A utility class for printing air tickets.
 */
public class TicketPrinter {
    /**
     * Prints an air ticket with the given information.
     *
     * @param name         the name of the passenger
     * @param surname      the surname of the passenger
     * @param timeOfFlight the time of the flight
     * @param planeClass   the class of the plane
     * @param country      the destination country
     */
    public static void printTicket(String name, String surname, String timeOfFlight, String planeClass, String country) {
        System.out.println("+-----------------------------+");
        System.out.println("|          AIR TICKET         |");
        System.out.println("+-----------------------------+");
        System.out.println("| Name:           " + name + "      |");
        System.out.println("| Surname:        " + surname + "      |");
        System.out.println("| Time of flight: " + timeOfFlight + " |");
        System.out.println("| Class of plane: " + planeClass + "      |");
        System.out.println("| Country:        " + country + "      |");
        System.out.println("+-----------------------------+");
    }
}
