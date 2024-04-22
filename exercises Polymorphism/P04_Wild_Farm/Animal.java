package P04_Wild_Farm;

import java.text.DecimalFormat;

abstract class Animal {
    protected String name;
    protected double weight;
    protected String livingRegion;
    protected int foodEaten;

    public Animal(String name, double weight, String livingRegion) {
        this.name = name;
        this.weight = weight;
        this.livingRegion = livingRegion;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    protected String formatWeight() {
        DecimalFormat df = new DecimalFormat("0.#");
        return df.format(weight);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + name + ", " + formatWeight() + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
