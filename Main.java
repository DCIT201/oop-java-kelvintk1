public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Adding vehicles to the agency
        agency.addVehicle(new Car("C001", "Toyota Camry", 50, true));
        agency.addVehicle(new Motorcycle("M001", "Harley Davidson", 30, false));
        agency.addVehicle(new Truck("T001", "Ford F-150", 70, 1000));

        // Creating a customer
        Customer customer = new Customer("CIST001", "Kelvin Tetteh");

        // Renting a vehicle  
        Vehicle vehicleToRent = agency.findAvailableVehicle("Toyota Camry");
        if (vehicleToRent != null) {
            agency.processRental(customer, vehicleToRent, 3);
        }

        // Returning the vehicle
        agency.returnVehicle(vehicleToRent);
    }
}