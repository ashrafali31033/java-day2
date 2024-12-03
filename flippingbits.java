import java.util.Scanner;
public class flippingbits {


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 no :");
        int a = sc.nextInt();
        System.out.println("enter 2 no :");
        int b = sc.nextInt();
        
        int c=a^(1<<b);
        




        System.out.println("the output is :"+c);
    }


    
}
