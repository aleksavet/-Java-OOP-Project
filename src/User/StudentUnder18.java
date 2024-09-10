package User;

/**

 The StudentUnder18 class represents a student user object who is under 18 years of age.
 It extends the User class and adds an additional property of adult email address.
 @author [Your Name]
 @version 1.0
 @see User
 */

public class StudentUnder18 extends User {
    String adult_email;

    /**
     * Creates a new student user object who is under 18 years of age with the given name, lastname, age, email and country.
     *
     * @param name the name of the student
     * @param lastname the lastname of the student
     * @param age the age of the student
     * @param email the email address of the student
     * @param country the country of the student
     */
    public StudentUnder18(String name, String lastname, int age, String email,String country) {
        super(name, lastname, age,country);
        this.adult_email = email;
    }


}
