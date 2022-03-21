import java.util.*;
class  Pgm
{
  public static  void main(String[] args)
   {
     String name;
     int age;
     float salary;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your name");
      System.out.println("Enter your age");
      System.out.println("Enter your salary");
        name=s.nextLine();
        age=s.nextInt();
        salary=s.nextInt();
      System.out.println("Name is " +name);
      System.out.println("Age is " +age);
      System.out.println("Salary is " +salary);
   }
}