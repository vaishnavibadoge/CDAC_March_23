import java.util.Scanner;
class Prime_No{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num=sc.nextInt();
		int j=0;
		if(num<0)
			System.out.println("Number is negative");
		else if(num==0)
			System.out.println("Its ZERO!!");
		else if(num==1)
			System.out.println("1 is neither composite nor prime");	
		else
		{
		for(int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				System.out.println("Number is not prime");
				j++;
				break;
			}
			else
			{
				continue;
			}
		}
		if(j==0)
			System.out.println("Number is prime");
		}
			
	}
}