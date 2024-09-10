package Booking;
/**

 Represents a rental property with a name, number of rooms, and rental rate.
 */
public class RentalProperty {
    /**

     Creates a new rental property with the given name, number of rooms, and rental rate.
     @param propertyName the name of the rental property
     @param numberOfRooms the number of rooms in the rental property
     @param rentalRate the rental rate for the rental property
     */
    private String propertyName;
    private int numberOfRooms;
    private double rentalRate;

    /**
     *Returns the name of the rental property.
    *@return the name of the rental property
    //*/
    public RentalProperty(String propertyName, int numberOfRooms, double rentalRate) {
        this.propertyName = propertyName;
        this.numberOfRooms = numberOfRooms;
        this.rentalRate = rentalRate;
    }
    /**

     Sets the name of the rental property.
     */
    // Getters and setters
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Nested class for rental agreement
    public static class RentalAgreement {

        private RentalProperty rentalProperty;
        private int numberOfMonths;

        // Constructor
        public RentalAgreement(RentalProperty rentalProperty, int numberOfMonths) {
            this.rentalProperty = rentalProperty;
            this.numberOfMonths = numberOfMonths;
        }

        // Getters and setters
        public RentalProperty getRentalProperty() {
            return rentalProperty;
        }

        public void setRentalProperty(RentalProperty rentalProperty) {
            this.rentalProperty = rentalProperty;
        }

        public int getNumberOfMonths() {
            return numberOfMonths;
        }

        public void setNumberOfMonths(int numberOfMonths) {
            this.numberOfMonths = numberOfMonths;
        }

        // Interface for rental agreement calculation
        public interface RentalAgreementCalculator {
            double calculateRentalAgreementCost(RentalAgreement rentalAgreement);
        }

        // Implementation of rental agreement cost calculator
        public static class DefaultRentalAgreementCalculator implements RentalAgreementCalculator {
            public double calculateRentalAgreementCost(RentalAgreement rentalAgreement) {
                return rentalAgreement.getRentalProperty().getRentalRate() * rentalAgreement.getNumberOfMonths();
            }
        }
    }
}
