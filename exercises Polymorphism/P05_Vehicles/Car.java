package P05_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    public  final static  double AC_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm + AC_FUEL_CONSUMPTION);

    }




}
