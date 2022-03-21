import java.util.*;
class  OneDArray
{
  public static  void main(String[] args)
  {
   int a[]=new int[5];
   Scanner  S=new Scanner(System.in);
   System.out.println("Enter the numbers");
   for(int i=0; i<5; i++)
   {
     a[i]=S.nextInt();
   }
  System.out.println("Displaying the numbers");
   for(int i=0; i<5; i++)
   {
    System.out.println(a[i]);
   }
 }
}
