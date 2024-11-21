import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.checkLeapYear();
        calculator.calculateTriangleArea();
    }

    // Method to check if the year is a leap year
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to ask user for base and height of triangle
    public void calculateTriangleArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = computeArea(base, height);
        
        outputArea(area);
    }

    // Method to compute area of triangle
    public double computeArea(double base, double height) {
        return (base * height) / 2;
    }

    // Method to output calculated area
    public void outputArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }
}