import java.util.Scanner;
class Factorial{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the no.:");
		int num = sc.nextInt();
		if(num<0)
		{
			System.out.println("Number is negative!!");
		}
		else if(num==0)
		{
			System.out.println("Its ZERO!!");
		}	
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact = fact*i;
			}
			System.out.println("Factorial is: "+fact);
		}
	}
}