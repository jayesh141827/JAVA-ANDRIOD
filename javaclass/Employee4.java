class Employee4
{
    int id;
  String name;
 Employee (int sid,String sname)
 {
    id=id;
    name=name;
 }
 void display()
 {
    System.out.println("id:"+id+ " "+name);
 }

}
        
class Student
{
        public static void main(String arge[])
       {
        Employee e = new Employee(102,"sandip jaiswal");
        Employee e1 = new Employee(103,"mandip jaiswal");
        e.display();
        e1.display();
}
}
