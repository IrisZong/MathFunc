
import java.util.Scanner;
import static java.lang.Math.*;


public class Math_func {
    
    public static void main(String args[]) 
    {


    Scanner sacn = new Scanner(System.in); 
    System.out.println("pls enter 2 numbers : ");
    int n=sacn.nextInt();
    int b=sacn.nextInt();

    System.out.println("the square root of "+n+ " is "+sqrt(n));
    System.out.println("the square root of "+b+ " is "+sqrt(b));

    System.out.println("the max is "+max(n,b));

    System.out.println(b+" to the power of "+n+ " is "+pow(b,n));
    System.out.println(n+" to the power of "+b+ " is "+pow(n,b));

    System.out.println("the logarithm of "+n+ " is "+log(n));
    System.out.println("the logarithm of "+b+ " is "+log(b));
    

    

}
}
