package Assignment1;
import java.util.Scanner;
public class FibonacciUsingRecursion {
    static int a=0,b=1,c;
    public static void main(String[] args)
    {
        System.out.print("Please provide number of terms:");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input==1)
            System.out.print("0");
        else if(input==2)
            System.out.print("0 1");
        else
        {
            System.out.print(a+" "+b);
        FibonacciUsingRecursion ob= new FibonacciUsingRecursion();
        ob.fib(input);
        }
    }
    void fib(int n)
    {
        if(n>=1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fib(n-1);
        }
    }
}
