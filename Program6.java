import java.util.Scanner;

public class Program6 {
    public static String convert(double value){
        String stringValue = String.format("%.3f", value);     
        return stringValue;
    }
    public static void main(String[] args){
        final double pi = 3.14159;
        Scanner read = new Scanner(System.in);
        

        System.out.println("Enter the radius: ");
        double radius = read.nextDouble();

        double diameter = radius * 2;
        double area = Math.pow(radius, 2) * pi;
        double circumferance = diameter * pi;
        System.out.println("The Radius of the circle: " + convert(radius));
        System.out.println("The Diameter of the circle: " + convert(diameter));
        System.out.println("The Area of the circle: " + convert(area));
        System.out.println("The Circumferance of the circle: " + convert(circumferance));

    }
}

//Paste console output below:

// I also think the example values for the area and circumferance were also wrong
/*
Enter the radius: 
3.712
The Radius of the circle: 3.712
The Diameter of the circle: 7.424
The Area of the circle: 43.288
The Circumferance of the circle: 23.323

*/
