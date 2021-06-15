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
			if(a>0)
			{
                  System.out.println("\n Entered Number is Positive ");	
			}
			else if(a<0)
			{
		   		 System.out.println("\n Entered Number is Negative ");
			}
			else
			{
			      System.out.println("\n Entered Number is Zero");
			}			
	} 
}
/*
D:\GItHub>javac NumPositiveNegativeZero.java

D:\GItHub>java Maximum

 Enter a Number :
100

 Entered Number is Positive

D:\GItHub>java Maximum

 Enter a Number :
-200

 Entered Number is Negative

D:\GItHub>java Maximum

 Enter a Number :
0

 Entered Number is Zero

D:\GItHub>*/
