public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }


    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.9; // 10% discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "vehicleId='" + getVehicleId() + '\'' +
                ", model='" + getModel() + '\'' +
                ", baseRentalRate=" + getBaseRentalRate() +
                ", hasSidecar=" + hasSidecar +
                '}';
    }
}