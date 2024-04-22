package P06_Vehicles_Extension;

public class Car extends Vehicle {

    public  final static  double AC_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumptionPerKm,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm + AC_FUEL_CONSUMPTION,tankCapacity);

    }




}
