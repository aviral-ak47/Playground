import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int num1 = in.nextInt();int num2 = in.nextInt();int num3=in.nextInt();
      int gcd=0;
 for(int i = 1; i <= num1 && i <= num2 && i<=num3; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
      System.out.println(gcd);
	}
}