package P04_Wild_Farm;

 class Mouse extends Animal{
     public Mouse(String name, double weight, String livingRegion) {
         super(name, weight, livingRegion);
     }

     @Override
     public void makeSound() {
         System.out.println("SQUEEEAAAK!");
     }

     @Override
     public void eat(Food food) {
         if (food instanceof Vegetable) {
             this.foodEaten += food.quantity;
         } else {
             System.out.println("Mice are not eating that type of food!");
         }
     }
 }
