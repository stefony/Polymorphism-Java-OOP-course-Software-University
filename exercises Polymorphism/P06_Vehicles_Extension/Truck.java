package P06_Vehicles_Extension;

public class Truck extends Vehicle {

   public static final double AC_FUEL_CONSUMPTION = 1.6;
    public static final double TANK_LEAK = 0.95;

    public Truck(double fuelQuantity, double fuelConsumptionPerKm,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm + AC_FUEL_CONSUMPTION,tankCapacity);


    }



    @Override
    public void refuel(double liters) {
        super.refuel(liters * TANK_LEAK);
    }


}
