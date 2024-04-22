package P06_Vehicles_Extension;

public class Bus extends Vehicle{

    public  final static  double AC_FUEL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm ,tankCapacity);
    }

    @Override
    public String drive (double distance){
        setFuelConsumptionPerKm(getFuelConsumptionPerKm() + AC_FUEL_CONSUMPTION);
       String driveResult=  super.drive(distance);
       setFuelConsumptionPerKm(getFuelConsumptionPerKm() - AC_FUEL_CONSUMPTION);
       return driveResult;
    }

    public String driveEmpty(double distance){
        return  super.drive(distance);
    }

}
