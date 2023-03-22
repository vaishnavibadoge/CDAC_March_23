import java.util.Scanner;
class Sum_Of_Digits_Of_Num{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0,rem;
		for(int i=1;num>0;i++)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits of "+temp+" is "+sum);
	}
}