class Employee
{
    int id;
    String name;
}

  class Student {
    public static void main(String args[]) {
        Employee e = new Employee();
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e.id = 101;
        e.name = "ram";

        e1.id = 102;
        e1.name = "sita";

        e2.id = 103;
        e2.name = "gita";

        System.out.println("id is " + e.id + " and name is " + e.name);
        System.out.println("id is " + e1.id + " and name is " + e1.name);
        System.out.println("id is " + e2.id + " and name is " + e2.name);
    }
}
