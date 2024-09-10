package User;

public class Adult extends User
{

    /**

     The Adult class represents an adult user object who is a subclass of the User class.
     It adds an additional property of email address to the user object.
     @author [Your Name]
     @version 1.0
     @see User
     */
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adult(String name, String lastname, int age, String email,String country) {
        super(name, lastname, age,country);
        this.email = email;
    }

}
