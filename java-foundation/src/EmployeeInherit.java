public class EmployeeInherit {
    public static void main(String[] a)
    {
        Developer dev1 = new Developer(1, "Karan", 2000);
        dev1.display();
    }
}
class Employee1
{
    int id;
    String name;
    Employee1(int id, String n)
    {
        this.id = id;
        this.name = n;
    }
}
class Developer extends Employee1
{
    int salary;
    Developer(int id, String name, int salary)
    {
        super(id, name);
        this.salary = salary;
    }
    void display()
    {
        System.out.println("ID: "+id+ "   Name: "+name+ "   Salary: "+salary);
    }
}