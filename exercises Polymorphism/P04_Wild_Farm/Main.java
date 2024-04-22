package P04_Wild_Farm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Animal animal = null;
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("End")) break;
                String[] parts = line.split("\\s+");
                if (parts[0].equals("Vegetable") || parts[0].equals("Meat")) {
                    int quantity = Integer.parseInt(parts[1]);
                    Food food;
                    if ("Vegetable".equals(parts[0])) {
                        food = new Vegetable(quantity);
                    } else {
                        food = new Meat(quantity);
                    }
                    if (animal != null) {
                        animal.makeSound();
                        animal.eat(food);
                        System.out.println(animal);
                    }
                } else {
                    if (parts.length == 5) { // Cat
                        animal = new Cat(parts[1], Double.parseDouble(parts[2]), parts[3], parts[4]);
                    } else if (parts.length == 4) { // Other Animals
                        switch (parts[0]) {
                            case "Tiger":
                                animal = new Tiger(parts[1], Double.parseDouble(parts[2]), parts[3]);
                                break;
                            case "Zebra":
                                animal = new Zebra(parts[1], Double.parseDouble(parts[2]), parts[3]);
                                break;
                            case "Mouse":
                                animal = new Mouse(parts[1], Double.parseDouble(parts[2]), parts[3]);
                                break;
                        }
                    }
                }
            }
            scanner.close();
        }
    }

