package Attraction;

import User.User;

import java.util.Scanner;

/**
 * The Question class handles asking the user what type of vacation they prefer and calling the appropriate vacation planner.
 */
public class Question
{
    private Vacation vacation;
    private TravelVacation<ActiveVacation> activeVacationManager;
    private TravelVacation<PassiveVacation> passiveVacationManager;
    Scanner scanner = new Scanner(System.in);



    public Question( ) {

    }
    /**
     * Asks the user what type of vacation they prefer and calls the appropriate vacation planner.
     *
     * @param country the country the user wants to visit
     */
    public void typeofvacation(String country)
    {
        System.out.println("Which type of vacation do you prefer?\n active(press 'a') or passive (press 'p')");
        String answer = scanner.next();
        if(answer.equals("a"))
        {
            new ActiveVacation().plan(country);
        } else if (answer.equals("p")) {
            new PassiveVacation().plan(country);
        }
    }


}
