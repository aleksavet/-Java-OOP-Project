package TravelTrove;
/**

 The TravelTrove class represents the main class for the TravelTrove application.
 It creates and runs a questionnaire object.
 @author [Alexandra Vetrov]
 @version 1.0
 @see Questionnaire
 */

public class TravelTrove {


    /**
     * The main method creates a questionnaire object and starts it.
     *
     * @param args the arguments passed to the application
     */

    public static void main(String[] args) {
        Questionnaire questionnaire =new Questionnaire();
        questionnaire.start();

    }



}