public class EmployeeAbstract {
    public static void main(String[] a){
        FullTimeEmployee fe = new FullTimeEmployee();
        fe.calculateSalary();
        PartTimeEmployee pe = new PartTimeEmployee();
        pe.calculateSalary();
    }
}
abstract class Employee2{
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee2{
    @Override
    void calculateSalary(){
        System.out.println("Salary calculate: 50,000");
    }
}
class PartTimeEmployee extends Employee2{
    @Override
    void calculateSalary(){
        System.out.println("Salary calculate: 30,000");
    }
}