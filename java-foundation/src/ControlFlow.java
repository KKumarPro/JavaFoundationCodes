import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] a)
    {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        for(int i=0; i<=5; i++)
            System.out.println(i);

        int x = 10;
        do{
            System.out.println(x);
            x++;
        }
        while(x<20);

    }
}
