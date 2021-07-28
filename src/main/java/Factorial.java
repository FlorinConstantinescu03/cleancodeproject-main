
import java.util.Scanner;
class Factorial
{
    public static void main(String[] arg)
    {
        long n;

        Scanner sc=new Scanner(System.in);

        System.out.println("introdu un numar");

        n=sc.nextLong();

        long f=Factorial.fact(n);

        System.out.println("factorial="+f);
    }

    static long fact(long n)
    {
        if(n==0)
            return 1;
        if(n<0)
            throw new IllegalArgumentException("Numarul trebuie sa fie mai mare sau egal cu 0");
        if(n>12)
            throw new IllegalArgumentException("Numarul trebuie sa fie mai mic decat sau egal cu 12");
        return Factorial.fact(n-1)*n;
    }

}
