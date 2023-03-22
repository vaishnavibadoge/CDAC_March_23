/*Input : 3 numbers num1,num2,num3
identify MAX and MIN*/
import java.util.*;
class Max_Min_3Variables{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
		int min = (num2>num1)?(num3>num1?num1:num3):(num3>num2?num2:num3);
		System.out.println("Maximum number is: "+max);
		System.out.println("Minimun number is: "+min);
		
	}
}
