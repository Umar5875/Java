import java.util.Scanner;
class Person{
String name;
String gender;
String address;
int age;

public Person(String name,String gender,String address,int age){
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
public void display(){
System.out.println("Name : "+name);
System.out.println("Gender : "+gender);
System.out.println("Address : "+address);
System.out.println("Age : "+age);
}
}
class Employee extends Person{
int empId;
String ComName;
String qualifi;
double salary;

public Employee(String name,String gender,String address,int age,int empId,String ComName,String qualifi,double salary){
super(name,gender,address,age);
this.empId=empId;
this.ComName=ComName;
this.qualifi=qualifi;
this.salary=salary;
}
public void display(){
super.display();
System.out.println("Employee Id : "+empId);
System.out.println("Company Name : "+ComName);
System.out.println("Qualification : "+qualifi);
System.out.println("Salary : "+salary);
}
}
class Teacher extends Employee{
String subject;
String depa;
int teaId;

public Teacher(String name,String gender,String address,int age,int empId,String ComName,String qualifi,double salary,String subject,String depa,int teaId){
super(name,gender,address,age,empId,ComName,qualifi,salary);
this.subject=subject;
this.depa=depa;
this.teaId=teaId;
}
public void display(){
super.display();
System.out.println("Subject: "+subject);
System.out.println("Department : "+depa);
System.out.println("Teacher Id : "+teaId);
System.out.println("----------------------------------------------------------------");
}
}
public class MultilevelInheritanceDemo{
  public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  System.out.println("ENTER THE NUMBER OF TEACHERS (N): ");
  int n=input.nextInt();
  Teacher[] newT=new Teacher[n];
  for(int i=0;i<n;i++){
  System.out.println("\n---Enter Details for Teacher "+(i+1)+"---");
  input.nextLine();
  System.out.println("NAME: ");
  String name=input.nextLine();
  System.out.println("GENDER: ");
  String gender=input.nextLine();
  System.out.println("Address: ");
  String add=input.nextLine();
  System.out.println("AGE: ");
  int age=input.nextInt();
  System.out.println("Employee Id: ");
  int emid=input.nextInt();
  input.nextLine();
  System.out.println("Company Name: ");
  String ca=input.nextLine();
  System.out.println("Qualification: ");
  String qua=input.nextLine();
  System.out.println("Salary: ");
  double sala=input.nextDouble();
  input.nextLine();
  System.out.println("Teacher Id: ");
  int tid=input.nextInt();
  input.nextLine();
  System.out.println("Subject: ");
  String sub=input.nextLine();
  System.out.println("Department: ");
  String depa=input.nextLine();
  newT[i]=new Teacher(name,gender,add,age,emid,ca,qua,sala,sub,depa,tid);
  }
  System.out.println("======================================================");
  System.out.println("                 TEACHER RECORDS");
  System.out.println("======================================================");
  for(int i=0;i<n;i++){
  newT[i].display();
  }
}
}

