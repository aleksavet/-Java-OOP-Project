package Country;
/**
 * The {@code ColdCountry} class represents a country with a cold climate.
 * It extends the {@link Country} class and adds a specialization to the
 * kind of food served in cold countries.
 *
 * @see Country
 */

public class ColdCountry extends Country{


    /**
     * Constructs a new {@code ColdCountry} object with the given food.
     *
     * @param food the type of food served in cold countries
     */
    public ColdCountry(String food)
    {
        super("Cold",food);
    }

}
