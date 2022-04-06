class Employee
{
  int r;
  String n;
  int p;
  String des;
  String dep;
  
  Employee(int record_id, String Name, int ph_number, String Designation, String Department)
    {
       r = record_id; 
       n = Name;
       p = ph_number;
       des = Designation;
       dep = Department;
    }

void display()
  {
    System.out.println(r+"\t\t"+n+"\t\t"+p+"\t\t"+des+"\t\t"+dep);
   }
 public static void main(String[]args)
 {
    Employee ob1=new Employee(01,"Lekshmi",95390066,"HOD","MCA");
    Employee ob2=new Employee(02,"Akshay",63254567,"PRINCIPAL","MCA");
    Employee ob3=new Employee(03,"Kiran",87658645,"DIRECTOR","MCA") ;
    Employee ob4=new Employee(04,"Aromal",77554763,"STAFF","MCA");
    ob1.display();
    ob2.display();
    ob3.display();
    ob4.display();
 }
}





