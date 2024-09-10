package User;
/**

 The Student class represents a student user object who is an adult.
 It extends the Adult class and adds an additional property of ID card.
 @author [Your Name]
 @version 1.0
 @see Adult
 */

public class Student extends Adult{
    private String id_card;
    public Student(String name, String lastname, int age, String email, String id, String country) {
        super(name, lastname, age, email,country);
        this.id_card =id;
    }


}
