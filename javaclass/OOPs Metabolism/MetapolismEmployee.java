class MetapolismEmployee {
    public static void main(String args[]) {
        Employee b = new Employee();
        b.setEmployee(4200, "ram", "Manager", 100000);
        b.get();
    }
}

class Employee {

    private int emp_id;
    private String emp_name;
    private String emp_designation;
    private int emp_salary;

    void setEmployee(int emp_id, String emp_name, String emp_designation, int emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_designation = emp_designation;
        this.emp_salary = emp_salary;
    }

    void get() {
        System.out.println("emp_id: 4290 " );
        System.out.println("emp_name: ram " );
        System.out.println("emp_designation: Manager " );
        System.out.println("emp_salary: 100000 " );
    }
}
