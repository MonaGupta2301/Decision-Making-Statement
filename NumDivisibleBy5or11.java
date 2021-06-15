//Wap to demo of Whether the number is Positive,Negative or Zero
import java.util.Scanner;
class Maximum
{
	public static void main(String arg[])
	{
	        int a;
			Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter a Number :");
            a=sc.nextInt();
			if(a%5==0 && a%11==0)
            {
		   		 System.out.println("\n Entered Number is Divisible by both 11 and 5");
			}
			else if(a%5==0)
			{
                  System.out.println("\n Entered Number is Divisible By 5 ");	
			}
			else if(a%11==0)
			{
		   		 System.out.println("\n Entered Number is Divisible by 11 ");
			}
			else
			{
			      System.out.println("\n Entered Number is nither Divisble by 5 or 11");
			}			
	} 
}
