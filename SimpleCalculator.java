import java.util.*;
class  SimpleCalculator
{
  public static  void main(String[] args)
   {
     int a, b,c,choice;
      Scanner s=new Scanner(System.in);
      System.out.println("1.Add ");
      System.out.println("2.Difference");
      System.out.println(" 3.Multiplication");
      System.out.println("4.Division");
      System.out.println("Enter the choice");
      choice=s.nextInt();
      System.out.println("Enter the numbers");
      a=s.nextInt();
     b=s.nextInt();
     switch(choice)
     {
       case 1:
             c=a+b;
             System.out.println("Addition is " +c);
             break;
      case 2:
             c=a-b;
             System.out.println("difference is " +c);
             break;
      case 3:
             c=a*b;
             System.out.println("Multiplication is " +c);
             break;
      case 4:
             c=a/b;
             System.out.println("Division is " +c);
             break;
      default:
                System.out.println("Invalid");
     }
   }
} 
   
