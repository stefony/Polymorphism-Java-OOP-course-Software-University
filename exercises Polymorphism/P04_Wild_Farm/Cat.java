package P04_Wild_Farm;

import java.text.DecimalFormat;

class Cat extends Animal{
    private String breed;

    public Cat(String name, double weight, String livingRegion, String breed) {
        super(name, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        return "Cat[" + name + ", " + breed + ", " + formatWeight() + ", " + livingRegion + ", " + foodEaten + "]";
    }
}

