import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        final double pi = 3.14159;
        Scanner read = new Scanner(System.in);
        

        System.out.println("Enter the radius: ");
        double radius = read.nextDouble();

        double diameter = radius * 2;
        double area = Math.pow(radius, 2) * pi;
        double circumferance = diameter * pi;
        System.out.println("The Radius of the circle: " + radius);
        System.out.println("The Diameter of the circle: " + diameter);
        System.out.println("The Area of the circle: " + area);
        System.out.println("The Circumferance of the circle: " + circumferance);

    }
}

//Paste console output below:

// I also think the example values for the area and circumferance were also wrong
/*
Enter the radius: 
3.712
The Radius of the circle: 3.712
The Diameter of the circle: 7.424
The Area of the circle: 43.28779268096
The Circumferance of the circle: 23.32316416

*/
