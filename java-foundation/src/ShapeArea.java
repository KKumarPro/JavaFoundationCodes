public class ShapeArea {
    public static void main(String[] a)
    {
        Shape s;
        s = new Circle(19);
        s.area();

        s = new Rectangle(98,23);
        s.area();
    }
}
class Shape
{
    void area()
    {
        System.out.println("Area of Shapes");
    }
}
class Circle extends Shape
{
    private int radius;
    Circle(int r)
    {
        this.radius = r;
    }
    @Override
    void area()
    {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: "+result+ " cm^2");
    }
}
class Rectangle extends Shape
{
    private int length, breadth;
    Rectangle(int L, int B)
    {
        this.length = L;
        this.breadth = B;
    }
    @Override
    void area()
    {
        int result = length * breadth;
        System.out.println("Area of Rectangle: "+result+ " cm^2");
    }
}