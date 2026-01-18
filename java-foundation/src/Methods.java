//Methods: A method is a block of codes, that performs a specific task and can be executed when called.

public class Methods {
    static void line()
    {
        System.out.println("___________________________");
    }
    static int square(int num)
    {
        return num * num;
    }
    static boolean even(int n)
    {
        return n%2==0;
    }
    public static void main(String[] a)
    {
        line();
        int result = square(10);
        System.out.println(result);
        line();
        System.out.println(even(11));
        System.out.println(even(222));
    }
}
