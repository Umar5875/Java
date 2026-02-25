import java.util.Scanner;
class Geometry{
//area of circle
  double area(double r){
    return Math.PI*r*r;
    }
//area of rectangle
  double area(double l,double b){
    return l*b;
    }
//area of triangle
double area(double a ,double b,double c){
if ( (a+b <= c) || (a+c <= b) || (b+c<= a)){
System.out.print("triangle not formed ");
return 0;
}
double s = (a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
}
public class MethodOverloadingDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Geometry g= new Geometry ();
System.out.println("--- Method Overloading: Area Calculation ---\n");
//area of circle
System.out.print("Enter radius of the Circle: ");
double r = sc.nextDouble();
System.out.println("Area of circle :"+g.area(r));


//area of rectangle
System.out.println("Enter length and breadth of rectangle:");
double l=sc.nextDouble();
double b=sc.nextDouble();
System.out.println("Area of rectangle:"+g.area(l,b));


//area of triangle
System.out.println("Enter a,b,c sides  of triangle:");
double p=sc.nextDouble();
double q=sc.nextDouble();
double t=sc.nextDouble();
System.out.println("Area of triangle:"+g.area(p,q,t));
}
}
