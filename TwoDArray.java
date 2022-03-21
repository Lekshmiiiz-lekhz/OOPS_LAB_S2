import java.util.*;
class  TwoDArray
{
  public static  void main(String[] args)
  {
   int a[][]=new int[2][3];
   Scanner  S=new Scanner(System.in);
   System.out.println("Enter the numbers");
   for(int i=0; i<2; i++)
   {
      for(int j=0; j<3; j++)
      {
     a[i][j]=S.nextInt();
      }
   }
  System.out.println("Displaying the matrix elements");
   for(int i=0; i<2; i++)
    {
      for(int j=0; j<3; j++)
       {
          System.out.println(a[i][j]);
       }
    }
 }
}
 