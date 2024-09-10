package Attraction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * The TravelVacation class represents a collection of vacations.
 * It uses a generic type parameter T to indicate the type of vacation
 * being stored in the collection. The class provides methods to add and remove
 * vacations, retrieve a list of all vacations, and print all vacations in the collection.
 *
 * @param <T> the type of vacation being stored in the collection.
 */
public class TravelVacation<T extends Vacation>
{
    private List<T> vacations; /**
 * Constructs a new TravelVacation object with an empty collection of vacations.
 */
    public TravelVacation()
    {
        this.vacations=new ArrayList<>();

    }
    /**
     * Constructs a new TravelVacation object with an empty collection of vacations.
     */
    public void addVacation(T vacation)
    {
        vacations.add(vacation);
    }
    public void remove(T vacation)
    {
        vacations.remove(vacation);
    }
    public List<T> getVacations()
    {
        return vacations;
    }


    public void printFiltered(Predicate<T> predicate) {
        vacations.stream().filter(predicate).forEach(System.out::println);
    }






}
