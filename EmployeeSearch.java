import java.util.Scanner;
// Employee Class
class Employee {
int eNo;
String eName;
double eSalary;

// Default Constructor
Employee() {
eNo = 0;
eName = "Unknown";
eSalary = 0;
}
// Parameterized Constructor
public Employee(int c, String n, double p) {
eNo = c;
eName = n;
eSalary = p;
}
// Method to display employee details
public void display() {
System.out.println(eNo + "\t" + eName + "\t" + eSalary);
}
}
// Main Class
public class EmployeeSearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of employees: ");
int n = sc.nextInt();
// Array of Employee objects
Employee[] arr = new Employee[n];
System.out.println("\n--- Employee Details ---");
// Input employee details
for (int i = 0; i < n; i++) {
System.out.println("\nEmployee " + (i + 1) + ":");
System.out.print("Enter eNo: ");
int eNo = sc.nextInt();
sc.nextLine(); // clear buffer
System.out.print("Enter eName: ");
String eName = sc.nextLine();
System.out.print("Enter eSalary: ");
double eSalary = sc.nextDouble();
arr[i] = new Employee(eNo, eName, eSalary);
}
// Search employee
System.out.print("\nEnter Employee Number to search: ");
int searchId = sc.nextInt();
boolean found = false;
System.out.println("\n--- Search Results ---");
for (int i = 0; i < n; i++) {
if (searchId == arr[i].eNo) {
System.out.println("Employee Found:");
arr[i].display();
found = true;
break;
}
}
if (!found) {
System.out.println("Employee Not Found");
}
sc.close();
}
}
