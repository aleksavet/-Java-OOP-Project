package Booking;
import Attraction.Question;
import Final_print.Final_print;
import User.User;
import User.Student;
import User.Adult;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BookingTicket {
    /**

     This class represents the booking process for a flight ticket.
     It allows users to select a destination country, date, time of day, and class of plane.
     Users can view available dates and class options for each country, and then proceed to book their flight.


      time() - a constructor that creates a new time object with an hour, minute, and part of day.
     booking(String country) - allows the user to select a country and date, and then proceed with booking their flight.
     This class uses the Scanner class for user input.
     @see User

     */
    User user;
    Scanner scanner = new Scanner(System.in);
    time part;
    private String date;
    private String class_plane;
    private String country;
    /**
     * A class representing the time of day.
     */
    protected class time {
        private int hour;
        private int minute;
        private String part;
        /**
         * Creates a new time object with the specified part of day (m, a, or e).
         *
         * @param part a String representing the part of day (m, a, or e)
         */
        protected time(String part) {

            if (part.equals("m")) {
                setPart_d(part);
            } else if (part.equals("a")) {
                setPart_d(part);
            } else if (part.equals("e")) {
                setPart_d(part);
            }


        }
        /**
         * Returns the part of day for this time object.
         *
         * @return a String representing the part of day (m, a, or e)
         */

        public String getPart_d() {
            return part;
        }
        /**
         * Sets the part of day for this time object.
         *
         * @param part_d a String representing the part of day (m, a, or e)
         * @return a String representing the part of day (m, a, or e)
         */
        public String setPart_d(String part_d) {
            this.part = part_d;
            return part;
        }/**
         * Compares this time object to another object for equality.
         *
         * @param obj the object to compare to
         * @return true if the objects are equal, false otherwise
         */

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            time other = (time) obj;
            return toString().equals(other.toString());
        }

    }


    /**

     This method is used to initiate the booking process. The user inputs the desired country,
     and the available dates for flights are displayed. The user selects the date and the class of plane.
     Depending on the user's choice of country, different dates are available for booking.
     @param country A string indicating the desired country.
     */

 public void booking(String country)  {
     BookingTicket bookingTicket = new BookingTicket();
   try {
       if (country.equals("Sweden")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 17.05  23.05  25.05  31.05 9.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Norway")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 19.05  21.05  26.05  28.05 4.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Ireland")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 15.05  17.05  24.05  29.05 2.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Germany")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 14.05  20.05  21.05  29.05 2.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Greece")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 16.05  24.05  26.05  27.05 6.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Italy")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 17.05  23.05  24.05  29.05 4.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Bulgaria")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 14.05  21.05  24.05  27.05 1.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       } else if (country.equals("Albania")) {
           System.out.println("This dates are available for flight:");
           System.out.println("  please choose date and class of plane");
           System.out.println("Dates: 17.05  20.05  24.05  29.05 2.06");
           bookingTicket.date = scanner.nextLine();
           System.out.println("Class of plane:  first class - press 'f' /// economy class - press 'e'");
           bookingTicket.class_plane = scanner.next();
           booking_next(bookingTicket.date, bookingTicket.class_plane, country);
       }
   }catch (InvalidEmailException e)
   {
       String  errorMess=e.getMessage();
       System.out.println("An exception occurred: "+errorMess);
   }catch (InvalidNumberCard e)
   {
       String  errorMess=e.getMessage();
       System.out.println("An exception occurred: "+errorMess);
   }
 }

protected void booking_next(String date, String class_plane,String country) throws InvalidEmailException,InvalidNumberCard {

    if(class_plane.equals("f"))
    {
        String part = choosing();
        time time = new time(part);
        String hour = time_flight(part);
        System.out.println("Country: "+country+"\nDate: "+date+"\nTime: "+hour);
        System.out.println("Press 'a' if you an adult or 's' if you  under 18: ");
        String button = scanner.next();
        if(Objects.equals(button, "a")) {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your lastname: ");
            String ln = scanner.next();
            System.out.println("Enter your age: ");

            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("You are not an adult");
            }
            System.out.println("Enter your email: ");
            String email = scanner.next();
            if (!email.contains("@")) {
                throw new InvalidEmailException("Email address is incorrect");
            }
            user = new Adult(name, ln, age, email, country);
            TicketPrinter.printTicket(name, ln, hour, "first class", country);
            System.out.println("What type of accommodation you prefer? \n Hotel (press 'h') or accommodation for rent (press 'r'): ");
            String answer = scanner.next();
            if (answer.equals("h")) {
                BookingHotel bookingHotel = new BookingHotel(new Hotel());
                String accomname = bookingHotel.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);

                Question question = new Question();
                question.typeofvacation(country);

                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            } else if (answer.equals("r")) {
                BookingHotel booking = new BookingHotel(new House_rent());
                String accomname = booking.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);

                Question question = new Question();
                question.typeofvacation(country);
                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            }

        }
            else if(Objects.equals(button,"s")) {
                System.out.println("Enter your name: ");
                String name2 = scanner.next();
                System.out.println("Enter your lastname: ");
                String ln2 = scanner.next();
                System.out.println("Enter your age: ");
                int age2 = scanner.nextInt();
                System.out.println("Enter email:");
            String email = scanner.next();

                System.out.println("Enter number of students card(ex.S421 568 456 899): ");
            String id = scanner.next();


                if (!id.contains("S") && (!(id.length() < 14))) {
                    throw new InvalidNumberCard("Number of id card is incorrect");
                }
            user = new Student(name2,ln2,age2,email,id,country);
            TicketPrinter.printTicket(name2, ln2, hour, "first class", country);
            System.out.println("What type of accommodation you prefer? \n Hotel (press 'h') or accommodation for rent (press 'r'): ");
            String answer = scanner.next();
            if (answer.equals("h")) {
                BookingHotel bookingHotel = new BookingHotel(new Hotel());
                String accomname = bookingHotel.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);

                Question question = new Question();
                question.typeofvacation(country);

                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            } else if (answer.equals("r")) {
                BookingHotel booking = new BookingHotel(new House_rent());
                String accomname = booking.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);

                Question question = new Question();
                question.typeofvacation(country);

                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            }
            }

        }


     else if (class_plane.equals("e"))
    {
        String hour = time_flight("f");
        System.out.println("Country: "+country+"\nDate: "+date+"\nTime: "+hour);
        System.out.println("Press 'a' if you an adult or 's' if you  under 18: ");
        String button = scanner.next();
        if(Objects.equals(button, "a"))
        {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your lastname: ");
            String ln = scanner.next();
            System.out.println("Enter your age: ");

            int age = scanner.nextInt();
            if(age<18)
            {
                System.out.println("You are not an adult");
            }
            System.out.println("Enter your email: ");
            String email = scanner.next();
            if(!email.contains("@"))
            {
                throw new InvalidEmailException("Email address is incorrect");
            }
            user = new Adult(name,ln,age,email,country);
            TicketPrinter.printTicket(name,ln,hour,"first class",country);
            System.out.println("What type of accommodation you prefer? \n Hotel (press 'h') or accommodation for rent (press 'r'): ");
            String answer = scanner.next();
            if (answer.equals("h")) {
                BookingHotel bookingHotel = new BookingHotel(new Hotel());
                String accomname = bookingHotel.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);
                Question question = new Question();
                question.typeofvacation(country);


                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            } else if (answer.equals("r")) {
                BookingHotel booking = new BookingHotel(new House_rent());
                String accomname = booking.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);

                Question question = new Question();
                question.typeofvacation(country);

                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            }

        }else if(Objects.equals(button,"s"))
        {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your lastname: ");
            String ln = scanner.next();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Enter number of students card(ex.S421 568 456 899): ");
            String id = scanner.next();
            System.out.println("Enter email: ");
            String email = scanner.next();
            if(!id.contains("S")&& (!(id.length() <14)))
            {
                throw new InvalidNumberCard("Number of id card is incorrect");
            }
            user = new Student(name,ln,age,email,id,country);
            TicketPrinter.printTicket(name,ln,hour,"first class",country);

            System.out.println("What type of accommodation you prefer? \n Hotel (press 'h') or accommodation for rent (press 'r'): ");
            String answer = scanner.next();
            if (answer.equals("h")) {
                BookingHotel bookingHotel = new BookingHotel(new Hotel());
                String accomname = bookingHotel.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);

                Question question = new Question();
                question.typeofvacation(country);
                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            } else if (answer.equals("r")) {
                BookingHotel booking = new BookingHotel(new House_rent());
                String accomname = booking.bookAccommodation(country);
                System.out.println("Your hotel is : " + accomname);


                Question question = new Question();
                question.typeofvacation(country);

                Final_print finalPrint = new Final_print(user, country, date, accomname, hour);
            }


        }

    }
}

    protected String time_flight(String t) {

        Random random = new Random();
        int hour=0;
        int minute=random.nextInt(60);
        if(t.equals("m"))
        {
            hour=random.nextInt(8)+4;
        }
        else if (t.equals("a")) {
            hour=random.nextInt(6)+11;

        } else if (t.equals("e")) {
            hour = random.nextInt(8)+17;
        }else if(t.equals("f"))
        {
            hour=random.nextInt(4)+13;
        }

        String h =String.format("%02d",hour);
        String m = String.format("%02d",minute);
        return h+":"+m;
    }

    /**
     * The BookingTicket class includes the following methods:
     *      choosing() - prompts the user to select a part of the day (morning, afternoon, or evening) and returns the user's input.
     *
     *
     */

    protected String choosing()
{
    System.out.println("Choose the part of the day when you would like to fly:");
    System.out.println("Morning - press 'm'\nAfternoon - press 'a'\nEvening - press 'e'");
    String butt = scanner.next();
    return butt;

}

}
