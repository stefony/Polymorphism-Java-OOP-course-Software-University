package P04_Wild_Farm;

 class Tiger extends Animal {
     public Tiger(String name, double weight, String livingRegion) {
         super(name, weight, livingRegion);
     }

     @Override
     public void makeSound() {
         System.out.println("ROAAR!!!");
     }

     @Override
     public void eat(Food food) {
         if (food instanceof Meat) {
             this.foodEaten += food.quantity;
         } else {
             System.out.println("Tigers are not eating that type of food!");
         }
     }
 }
