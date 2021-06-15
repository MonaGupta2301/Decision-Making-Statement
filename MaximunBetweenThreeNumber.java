// Wap to demo of Maximun Between three numbers
import java.util.Scanner;
class Maximum
{
	public static void main(String arg[])
	{
	        int a,b,c;
			Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter First Number :");
            a=sc.nextInt();
            System.out.println("\n Enter Second Number :");
            b=sc.nextInt();
            System.out.println("\n Enter Third Number :");
            c=sc.nextInt();			
			if(a>=b && a>=c)
			{
				System.out.println(" First Number is Maximum ");
			}
			if(b>=a && b>=c)
			{
				System.out.println(" Second Number is Maximum ");
			}
			else
			{
				System.out.println(" Third Number is Maximum ");	
			}
				 
	} 
}
/*
D:\GItHub>javac MaximunBetweenThreeNumber.java

D:\GItHub>java Maximum

 Enter First Number :
23

 Enter Second Number :
45

 Enter Third Number :
56
 Third Number is Maximum

D:\GItHub>*/