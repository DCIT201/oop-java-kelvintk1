public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public double getTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "customer=" + customer.getName() +
                ", vehicle=" + vehicle.getModel() +
                ", rentalDays=" + rentalDays +
                ", totalCost=" + getTotalCost() +
                '}';
    }
}