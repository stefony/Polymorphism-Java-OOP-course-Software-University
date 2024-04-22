package P05_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] carData  = scanner.nextLine().split("\\s+");
         double carFuelAmount = Double.parseDouble(carData[1]);
         double carFuelConsumption = Double.parseDouble(carData[2]);
         Car car = new Car(carFuelAmount,carFuelConsumption);

         String[] truckData  = scanner.nextLine().split("\\s+");
         double truckFuelAmount = Double.parseDouble(truckData[1]);
        double truckFuelConsumption = Double.parseDouble(truckData[2]);
         Truck truck = new Truck(truckFuelAmount,truckFuelConsumption);

        int numCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCommands ; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String commandType = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandType) {
                case "Drive":

                    if (vehicleType.equals("Car")) {
                        System.out.println(car.drive(argument));;
                    } else {
                        System.out.println(truck.drive(argument));
                    }
                    break;

                case "Refuel":

                    if (vehicleType.equals("Car")) {
                        car.refuel(argument);
                    } else {
                        truck.refuel(argument);
                    }
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);

    }
}
