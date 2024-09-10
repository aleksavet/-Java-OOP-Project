package Country;
/**

 The Country class represents a country and its characteristics such as climate and food preferences.
 It has two attributes, climate and food, and provides methods to retrieve these attributes.
 */
public class Country {
    public Country() {}
    /**
     * Creates an instance of the Country class with specified climate and food preferences.
     * @param climate a String representing the preferred climate of the country.
     * @param food a String representing the preferred type of food in the country.
     */
    protected Country(String climate,String food)
    {
        this.climate = climate;
        this.food = food;
    }

    String climate;
    String food;
    public String getClimate() {
        return climate;
    }//aggregation

    public String getFood() {
        return food;
    }




}
