package Final_print;
import User.Adult;
import User.User;

public class Final_print
{
   private User user;
    private String country;
    private  String date;
   private String hotel;
   private String time;

    public Final_print(User user, String country, String date, String hotel, String time) {
        this.user = user;
        this.country = country;
        this.date = date;
        this.hotel = hotel;
        this.time = time;
        print(user,country,date,hotel,time);
    }

    /**
     * Prints the details of the trip planned by the user.
     *
     * @param user the user who planned the trip
     * @param country the country where the trip is planned
     * @param date the date of the trip
     * @param hotel the hotel selected for the trip
     * @param time the time of the trip
     */


    public void print(User user, String country, String date, String hotel, String time)
    {
        System.out.println("\n\n Trip Details:");
        System.out.println("User: " + user.getName() );
        if (user instanceof User) {
            User customer = (User) user;
            System.out.println("Customer name: " + customer.getName());
        } else if (user instanceof Adult) {
            Adult agent = (Adult) user;
            System.out.println("Agent ID: " + agent.getAge());
        }
        System.out.println("Country: " + country);
        System.out.println("Date: " + date);
        System.out.println("Hotel: " + hotel);
        System.out.println("Time: " + time);
        System.out.println("Thank you for using this app for planning trip!");
    }

}
