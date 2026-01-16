public class Operators {
    public static void main(String[] args)
    {
        int a = 30;
        int b = 20;

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        double div= 10.3/2;
        int rem = a%b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);

        boolean result = (a>b) && (b>0);
        System.out.println(result);
    }
}
