# Polymorphism-Java-OOP-course-Software-University
Courses from my education Java OOP in @SoftUni
exercises: Polymorphism Object-Oriented-Programming
01.Math Operation 
Create a class MathOperation, which should have method add(). Method add() has to be invoked with two, three, or four Integers. 
02.Shapes 
Create class hierarchy, starting with abstract class Shape: 
•	Fields: 
o	perimeter: Double o area: Double 
•	Encapsulation for these fields 
•	Abstract methods: 
o	calculatePerimeter() o calculateArea() 
Extend Shape class with two children: 
•	Rectangle 
•	Circle 
Each of them needs to have: 
•	Fields:  
For Rectangle o height: Double o width: Double  
For Circle 
o	radius: Double 
•	Encapsulation for these fields 
•	Public constructor  
•	Concrete methods for calculations (perimeter and area) 
03.Animals 
Create a class Animal, which holds two fields: 
•	name: String 
•	favouriteFood: String 
The Animal has one abstract method explainSelf(): String. 
You should add two new classes - Cat and Dog. Override the explainSelf() method by adding concrete animal sound on a new line.
04. Wild Farm
Your task is to create a class hierarchy like the picture below. All the classes except Vegetable, Meat, Mouse, Tiger, Cat & Zebra should be abstract. 
Input should be read from the console. Every even line will contain information about the Animal in following format: 
"{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion}". 
If the animai is a cat: "{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} {CatBreed}". 
On the odd lines, you will receive information about the food that you should give to the Animal. The line will consist of FoodType and quantity separated by whitespace. 
You should build the logic to determine if the animal is going to eat the provided food. The Mouse and Zebra should check if the food is Vegetable. If it is they will eat it. Otherwise, you should print a message in the format: 
"{AnimalType} are not eating that type of food!". AnimalType to be in the plural. 
Cats eat any kind of food, but Tigers accept only Meat. If a Vegetable is provided to a tiger message like the one above should be printed on the console. 
After you read information about the Animal and Food then invoke makeSound() method of the current animal and then feed it. In the end, print the whole object in the format: 
"{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]". 
If the animal is a cat: "{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]". 
Proceed to read information about the next animal/food. The input will continue until you receive "End". 
Print all AnimalWeight with two digits after the decimal separator. Use the DecimalFormat class. 
Note: consider overriding toString() method. 	
05. Vehicles 
Write a program that models 2 vehicles (Car and Truck) and will be able to simulate driving and refueling them in the summer. Car and truck both have fuel quantity, and fuel consumption in liters per km and can be driven given distance and refueled with given liters. But in the summer both vehicles use the air conditioner and their fuel consumption per km is increased by 0.9 liters for the car and 1.6 liters for the truck. Also, the truck has a tiny hole in its tank and when it gets refueled it gets only 95% of the given fuel. The car has no problems when refueling and adds all given fuel to its tank. If the vehicle cannot travel a given distance its fuel does not change. 
Input 
•	On the first line - information about the car in format "Car {fuel quantity} {liters per km}". 
•	On the second line – info about the truck in the format "Truck {fuel quantity} {liters per km}". 
•	On the third line - a number of commands N will be given on the next N lines. 
•	On the next N lines – commands in the format: o Drive Car {distance} o Drive Truck {distance} o Refuel Car {liters} o Refuel Truck {liters} 
Output 
After each Drive command print whether the Car/Truck was able to travel a given distance in format if it’s successful. Print the distance with two digits after the decimal separator except for trailing zeros. Use the DecimalFormat class: 
"Car/Truck travelled {distance} km" 
Or if it is not: 
"Car/Truck needs refueling" 
Finally, print the remaining fuel for both car and truck rounded 2 digits after the floating point in the format: 
"Car: {liters} 
Truck: {liters}" 
06.Vehicles Extension 
Use your solution to the previous task for a starting point and add more functionality. Add new vehicle – Bus. Now every vehicle has tank capacity and fuel quantity cannot fall (set) below 0 (If fuel quantity becomes less than 0 print on the console "Fuel must be a positive number"). 
The vehicles cannot be filled with fuel more than their tank capacity. If you try to put more fuel in the tank than the available space, print on the console "Cannot fit fuel in tank" and do not add any fuel to the vehicle's tank. 
Add new command for the bus. The bus can drive with or without people. If the bus is driving with people, the airconditioner is turned on and its fuel consumption per kilometer is increased by 1.4 liters. If there are no people on the bus when driving the air-conditioner is turned off and does not increase the fuel consumption. 
Input 
•	On the first three lines you will receive information about the vehicles in the format: 
Vehicle {initial fuel quantity} {liters per km} {tank capacity} 
•	On the fourth line - a number of commands N will be given on the next N lines. 
•	On the next N lines – commands in format: 
o Drive Car {distance} o Drive Truck {distance} o Drive Bus {distance} o DriveEmpty Bus {distance} o Refuel Car {liters} o Refuel Truck {liters} o Refuel Bus {liters} Output 
•	After each Drive command print whether the Car/Truck was able to travel a given distance in format if it’s successful: "Car/Truck/Bus travelled {distance} km". 
•	If the command is invalid - do nothing. 
•	Or if it is not: "Car/Truck/Bus needs refueling". 
•	If given fuel is ≤ 0 print: "Fuel must be a positive number". 
•	If given fuel cannot fit in car or bus tank print: "Cannot fit fuel in tank". 
•	Finally, print the remaining fuel for a car, truck and bus rounded 2 digits after a floating point in the format: 
"Car: {liters} 
Truck: {liters} 
Bus: {liters}" 






