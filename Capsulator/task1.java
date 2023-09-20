public class task1 {

    public static void main(String[] args) {

        Student student = new Student();

        student.Student("4200", "jayesh parmar");

    }
}

class Student {

    String Roll;
    String Name;

    void Student(String Roll, String Name) {

        this.Roll = Roll;
        this.Name = Name;

        System.out.print("Student Roll number = " + Roll);
        System.out.println();

        System.out.print("Student Name = " + Name);

    }
}
