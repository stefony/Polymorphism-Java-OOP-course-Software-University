package P02_Shapes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


        Shape shape = new Rectangle(4.0 , 5.0);
        Shape shape1 = new Circle(8.0);

        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        System.out.println(shape1.calculatePerimeter());
        System.out.println(shape1.calculateArea());
        }

    }

