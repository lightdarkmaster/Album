import java.util.Scanner;

public class Rectangle{

    public static void main(String[] args) {
        double h;
        double w;
        double total;
        double area;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the width of the Box/Rectangle: ");
            w = input.nextInt();

            System.out.println("Enter the Height of the Box/Rectangle: ");
            h = input.nextInt();
        }

        total = w + h;
        area = w*h;

        System.out.println("The total length of the box is: " + total +"m");
        System.out.println("The Area of the rectangle is : " + area + " m");
        
    }
}