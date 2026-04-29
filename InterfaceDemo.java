import java.util.Scanner;
interface Shape {
    double area();
    double perimeter();
}

// 2. Concrete Implementation: Circle
class Circle implements Shape {

    // 3. Private variable
    private double radius;

    public Circle(double radius) {
        // 4. Prevent negative values
        this.radius = Math.abs(radius);
    }

    // 5. Override area()
    public double area() {
        // 6. Return area
        return Math.PI * radius * radius;
    }

    // 7. Override perimeter()
    public double perimeter() {
        // 8. Return perimeter
        return 2 * Math.PI * radius;
    }
}

// 3. Concrete Implementation: Rectangle
class Rectangle implements Shape {

    // 10. Private variables
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        // 11. Prevent negative values
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }

    // 12. Override area()
    public double area() {
        return length * width;
    }

    // 13. Override perimeter()
    public double perimeter() {
        return 2 * (length + width);
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 14. Polymorphic reference
        Shape currentShape = null;

        while (true) {
            System.out.println("\n--- Shape Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Execution terminated.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    // 15. UpcastingrrentShape = new Circle(r);
                    break;

                case 2:
                    System.out.print("Enter length and width: ");
                    double l = sc.nextDouble();
                    double w = sc.nextDouble();
                    // 16. Upcasting
                    currentShape = new Rectangle(l, w);
                    break;

                default:
                    System.out.println("Error: Invalid selection. Try again.");
                    continue;
            }

            // 17. Dynamic Method Dispatch
            System.out.printf("Area : %.2f\n", currentShape.area());
            System.out.printf("Perimeter : %.2f\n", currentShape.perimeter());
        }

        sc.close();
    }
}
