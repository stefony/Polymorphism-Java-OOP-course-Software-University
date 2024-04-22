package P04_Wild_Farm;

 class Zebra extends Animal{
     public Zebra(String name, double weight, String livingRegion) {
         super(name, weight, livingRegion);
     }

     @Override
     public void makeSound() {
         System.out.println("Zs");
     }

     @Override
     public void eat(Food food) {
         if (food instanceof Vegetable) {
             this.foodEaten += food.quantity;
         } else {
             System.out.println("Zebras are not eating that type of food!");
         }
     }
 }
