package P03_Animals;

public class Cat extends Animal{


    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%n MEEOW",super.explainSelf());
    }
}
