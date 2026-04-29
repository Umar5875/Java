
import java.util.Scanner;
import MathUtil.Calculator;

public class Packages{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Enter the first number:");
        double a=sc.nextDouble();
        sc.nextLine();
       System.out.print("Enter the Secound number:");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        if (b==0){
        System.out.println("Division by Zero is not allowed.");}
else {
        System.out.println("Division: " + calc.division(a, b));
    }
    
}
}
// javac -d . Calculator.java 
