import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet;

    public RentalAgency() {
        vehicleFleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getModel().equalsIgnoreCase(model) && vehicle.isAvailableForRental()) {
                return vehicle;
            }
        }
        return null; // No available vehicle found
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
            customer.addRentalTransaction(transaction);
            System.out.println("Rental processed: " + transaction);
        } else {
            System.out.println("Vehicle is not available for rental.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println("Vehicle returned: " + vehicle);
    }
}