// Wap to demo of Maximun Between two numbers
import java.util.Scanner;
class Maximum
{
	public static void main(String arg[])
	{
	        int a,b;
			Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter First Number :");
            a=sc.nextInt();
            System.out.println("\n Enter Second Number :");
            b=sc.nextInt();			
			if(a<b)
			{
                  System.out.println("\n Second Number is Maximum ");	
			}
			else if(a>b)
			{
		   		 System.out.println("\n First Number is Maximum ");
			}
			else
			{
			      System.out.println("\n Numbers are Equal");
			}			
	} 
}
/*
**********OUTPUT************
D:\GItHub>java Maximum

 Enter First Number :
12

 Enter Second Number :
56

 Second Number is Maximum

D:\GItHub>*/