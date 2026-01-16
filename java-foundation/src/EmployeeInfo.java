public class EmployeeInfo {
    public static void main(String[] a)
    {
        Employee e1 = new Employee(3112, "Karan Kumar", 30000);
        Employee e2 = new Employee(3221, "Ram K", 10000);
        e1.annualSalary();
        e2.annualSalary();
    }
}

class Employee
{
    int id; String name; double salary;

    Employee(int id, String n, double s)
    {
        this.id = id;
        this.name = n;
        this.salary = s;
    }
    void annualSalary()
    {
        System.out.println("My Annual Salary is: "+(12*salary));
    }
}