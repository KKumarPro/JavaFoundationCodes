public class VehicleClass {
    public static void main(String[] a)
    {
        Car c1 = new Car();
        c1.dispSpeed();
    }
}
class Vehicle
{
    int speed=90;
    Vehicle()
    {
        //System.out.println(speed);
    }
}
class Car extends Vehicle
{
    String name = "Fronx";
    void dispSpeed()
    {
        System.out.println("Speed: "+speed+" km/h");
        System.out.println("Car Name: "+name);
    }
}
