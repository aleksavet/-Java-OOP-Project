package User;

public class User {
    /**
     * The name of the user.
     */
    private   String name;

    /**
     * The lastname of the user.
     */
    private String lastname;
    /**
     * The age of the user.
     */
    private int age;
    /**
     * The country of the user.
     */
    private String country;
    /**
     * Creates a new user object with the given name, lastname, age and country.
     *
     * @param name the name of the user
     * @param lastname the lastname of the user
     * @param age the age of the user
     * @param country the country of the user
     */


   public User(String name, String lastname, int age,String country) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
